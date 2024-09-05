import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PalindromeNumbers solution = new PalindromeNumbers();
            
            System.out.print("Enter an integer to check if it is a palindrome: ");
            int x = scanner.nextInt();
            
            boolean isPalindrome = solution.isPalindrome(x);
            
            if (isPalindrome) {
                System.out.println(x + " is a palindrome.");
            } else {
                System.out.println(x + " is not a palindrome.");
            }
        }
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x > 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }
        return reversed == original;
    }
}
