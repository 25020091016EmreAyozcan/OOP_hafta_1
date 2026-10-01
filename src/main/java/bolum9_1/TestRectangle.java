package bolum9_1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("--- Rectangle 1 ---");
        System.out.println("Genişlik: " + rect1.getWidth());
        System.out.println("Yükseklik: " + rect1.getHeight());
        System.out.println("Alan: " + rect1.getArea());
        System.out.println("Çevre: " + rect1.getPerimeter());

        System.out.println("\n--- Rectangle 2 ---");
        System.out.println("Genişlik: " + rect2.getWidth());
        System.out.println("Yükseklik: " + rect2.getHeight());
        System.out.println("Alan: " + rect2.getArea());
        System.out.println("Çevre: " + rect2.getPerimeter());
    }
}