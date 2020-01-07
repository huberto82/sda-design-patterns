package strategy;

import java.math.BigDecimal;

/**
 * Bonus zaimplementowany jako singleton z użyciem  enum
 */
public enum RegularBonus implements Bonus {
    INSTANCE(2);

    private int percent;

    RegularBonus(int percent){
        this.percent = percent;
    }

    @Override
    public BigDecimal apply(BigDecimal price) {
        return price.multiply(new BigDecimal(100 - percent).divide(new BigDecimal("100")));
    }
}
