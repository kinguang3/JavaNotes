import java.util.Scanner;
public class PaymentTimeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter loan amount: ");
        double loan = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        double year = input.nextDouble();
        System.out.print("Enter annual interest rate (as a percentage): ");
        double air = input.nextDouble();
        double months = year * 12;
        double air_mth = air / (months * 100);
        // System.out.printf("airth = %.2f\n", air_mth);
        double mp = 865.25;
        double totalPayment = mp * months;
        System.out.printf("Monthly Payment = %.2f\n", mp);
        System.out.printf("Total Payment = %.2f\n", totalPayment);
        for(int i = 1; i <= months; i++) {
            System.out.println("#Payment        Interest        Principal        Balance");
            System.err.printf("%d               %.2f            %.2f            %.2f\n", i, (loan * air_mth), (mp - (loan * air_mth)), (loan - (mp - (loan * air_mth))));
            loan -= (mp - (loan * air_mth));
        }
        // Add code to read payment times from the user
    }
}
