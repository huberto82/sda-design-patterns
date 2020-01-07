package strategy;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Przykład trochę bardziej rozbudowanej klasy, która przyznaje bonus, jeśli bieżąca data jest kolejną rocznicą urodzin
 */
public class BirthDateBonus implements Bonus {
    private LocalDate current;
    private LocalDate birth;

    public BirthDateBonus(LocalDate current, LocalDate birth) {
        this.current = current;
        this.birth = birth;
    }

    @Override
    public BigDecimal apply(BigDecimal price) {
        if (current.equals(LocalDate.of(current.getYear(), birth.getMonthValue(), birth.getDayOfMonth()))) {
            return price.compareTo(new BigDecimal("100")) < 0 ? price.multiply(new BigDecimal("0.95")) : price.multiply(new BigDecimal("0.9"));
        } else {
            return price;
        }
    }
}
