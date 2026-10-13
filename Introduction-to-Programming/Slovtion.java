import java.util.Scanner;
public class Slovtion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double dev = b*b - 4*a*c;
        if (dev > 0) {
            double x1 = (-b + Math.sqrt(dev)) / (2*a);
            double x2 = (-b - Math.sqrt(dev)) / (2*a);
            System.out.println("方程有两个不同的实数根：x1 = " + x1 + ", x2 = " + x2);
        } 
        else if (dev == 0) {
            double x = -b / (2*a);
            System.out.println("方程有一个实数根：x = " + x);
        } 
        else {
            System.out.println("方程没有实数根。");
        }
    }
}
