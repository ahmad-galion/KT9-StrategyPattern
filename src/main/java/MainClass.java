import java.math.BigDecimal;

public class MainClass {

    public static void main(String[] args) {

        strategyPattern();

    }

    private static void strategyPattern() {
        printDiscount(Discount.easterYearDiscount(), BigDecimal.valueOf(100));
        printDiscount(Discount.newYearDiscount(),BigDecimal.valueOf(100));
        printDiscount(amount -> amount.multiply(BigDecimal.valueOf(0.5)),BigDecimal.valueOf(100));
    }

    private static void printDiscount(Discount ds,BigDecimal amount) {
        System.out.println(ds.applyDiscount(amount));
    }
}
