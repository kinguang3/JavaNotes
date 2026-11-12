import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] distinctNumbers = new int[10];
        int distinctCount = 0;

        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }
        }

        for (int number : numbers) {
            boolean isDistinct = true;
            for (int i = 0; i < distinctCount; i++) {
                if (distinctNumbers[i] == number) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctNumbers[distinctCount] = number;
                distinctCount++;
            }
        }

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctCount; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
        System.out.println();
    }
}
