import java.util.Scanner;
public class DecimalTOHex {
   public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num > 15){
            System.out.println("Error");
            return;
        }
        if(num <= 9){
            System.out.println("res is " + num);
        }
        else{
            char hex = (char)((num - 10) + 'A');
            System.out.println("res is " + hex);
        }
   }
}