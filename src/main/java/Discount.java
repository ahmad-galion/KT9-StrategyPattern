import java.math.BigDecimal;

public interface Discount {

    BigDecimal applyDiscount(BigDecimal amount);

    static Discount newYearDiscount (){
        return amount -> amount.multiply(BigDecimal.valueOf(0.25));
    }

    static Discount easterYearDiscount (){
        return amount -> amount.multiply(BigDecimal.valueOf(0.15));
    }


}
