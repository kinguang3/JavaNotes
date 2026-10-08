import java.util.Scanner;
public class Tem {

    public static void main (String args[]){
        double tem;
        Scanner input = new Scanner(System.in);
        System.out.println("输入温度");
        tem = input.nextDouble();
        double T = (tem + 32) * 9.0/5;
        System.out.println("The temperature in Celsius is: " + T);
    }
}
