import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        char charStart, charEnd;
        
        while (start < end) {
            charStart = s.charAt(start);
            charEnd = s.charAt(end);
            
            if (!Character.isLetterOrDigit(charStart)) {
                start++;
            } else if (!Character.isLetterOrDigit(charEnd)) {
                end--;
            } else {
                if (Character.toLowerCase(charStart) != Character.toLowerCase(charEnd)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string to check if it's a palindrome:");
            String input = scanner.nextLine();
            
            boolean result = isPalindrome(input);
            
            if (result) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}
 
