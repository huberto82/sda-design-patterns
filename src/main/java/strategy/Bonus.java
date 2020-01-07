package strategy;

import java.math.BigDecimal;

public interface Bonus {
    BigDecimal apply(BigDecimal price);
}
