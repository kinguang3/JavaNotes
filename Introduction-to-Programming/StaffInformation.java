import java.util.Scanner;
public class StaffInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name:");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week:");
        double time = input.nextDouble();
        System.out.print("Enter hourly pay rate:");
        double pay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate:");
        double tax = input.nextDouble();
        System.out.print("Enter state tax withholding rate:");
        double state = input.nextDouble();
        System.out.println("Employee name: " + name);   
        System.out.printf("Hours Worked: %.1f\n", time);
        System.out.printf("Pay Rate：$%.2f\n", pay);
        System.out.printf("Gross Pay: $%.2f\n", pay * time);
        System.out.println("Deductions:");
        System.out.printf("     Federal Withholding (%.1f%%): $%.2f\n", tax * 100, pay * time * tax);
        System.out.printf("     State Withholding (%.1f%%): $%.2f\n", state * 100, pay * time * state);
        System.out.printf("     Total Deduction: $%.2f\n", (pay * time * tax) + (pay * time * state));
        System.out.printf("Net Pay: $%.2f\n", (pay * time) - ((pay * time * tax) + (pay * time * state)));
    }
}
