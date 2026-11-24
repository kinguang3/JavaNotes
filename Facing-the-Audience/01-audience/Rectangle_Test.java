package audience;
public class Rectangle_Test {

public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(3, 6);

        System.out.println("Area of rect1: " + rect1.getArea());
        System.out.println("Area of rect2: " + rect2.getArea());
        System.out.println("Perimeter of rect1: " + rect1.getPerimeter());
        System.out.println("Perimeter of rect2: " + rect2.getPerimeter());
    }
}
