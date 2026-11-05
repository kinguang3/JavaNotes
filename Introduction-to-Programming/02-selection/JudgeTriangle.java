import java.util.Scanner;
public class JudgeTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if(side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("The sides must be positive numbers.");
            return;
        }
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("The triangle is valid.");
        } 
        else {
            System.out.println("The triangle is not valid.");
        }
    }
}
