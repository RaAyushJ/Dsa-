import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Armstrong: ");
        int number = sc.nextInt();
        int original = number, result = 0;

        int n = String.valueOf(number).length(); // Count digits

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        if (result == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is NOT an Armstrong number.");
    }
}
