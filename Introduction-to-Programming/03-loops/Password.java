import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your password: ");
            String password = input.next();
            judge(password);
        }
    }

    public static void judge(String password) {
        int digitCount = 0;
        int letterCount = 0;

        if (password.length() < 8) {
            System.out.println("Invalid Password");
            return;
        }

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (character >= '0' && character <= '9') {
                digitCount++;
            }
            if ((character >= 'a' && character <= 'z')
                    || (character >= 'A' && character <= 'Z')) {
                letterCount++;
            }
        }

        if (letterCount == 0 || digitCount < 2) {
            System.out.println("Invalid Password");
            return;
        }

        System.out.println("Valid Password");
    }
}
