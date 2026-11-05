public class SumDigits {
    public static void main(String[] args) {
        long n = 123456789;
        int sum = sumDigits(n);
        System.out.println("The sum of the digits in " + n + " is " + sum);
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}