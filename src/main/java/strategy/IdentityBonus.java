package strategy;

import java.math.BigDecimal;

/**
 * Klasa, która nie modyfikuje ceny
 */
public class IdentityBonus implements Bonus {
    @Override
    public BigDecimal apply(BigDecimal price) {
        return price;
    }
}
