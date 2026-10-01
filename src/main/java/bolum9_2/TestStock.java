package bolum9_2;

public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("THY", "Turk Hava Yollari");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println("--- Stock kontrol ---");
        System.out.printf("Price Change Percentage: %.2f%%\n", stock.getChangePercent());
    }
}