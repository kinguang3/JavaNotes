import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int sum = 0;
    do{ 
        num = input.nextInt();
        sum += num;
        System.out.println("sum");
    } while (num != 0);
    }
}
