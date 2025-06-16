import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Palindrome: ");
        int number = sc.nextInt();
        int original = number, reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (original == reverse)
            System.out.println(original + " is a Palindrome number.");
        else
            System.out.println(original + " is NOT a Palindrome number.");
    }
}
