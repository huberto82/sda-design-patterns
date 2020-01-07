package strategy;

import java.math.BigDecimal;

public class ChristmasBonus implements Bonus {
    @Override
    public BigDecimal apply(BigDecimal price) {
        return price.multiply(new BigDecimal("0.95"));
    }
}
