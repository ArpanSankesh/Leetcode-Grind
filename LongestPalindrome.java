import java.util.HashMap;
import java.util.Scanner;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        // Frequency map to store counts of each character
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        int length = 0;
        boolean oddCountFound = false;
        
        // Calculate the maximum length of the palindrome
        for (int count : freqMap.values()) {
            if (count % 2 == 0) {
                length += count;  // Add all even counts
            } else {
                length += count - 1;  // Add the largest even part of the odd count
                oddCountFound = true;  // Mark that there's an odd count
            }
        }
        
        // If there's an odd count, we can place exactly one odd character in the center
        if (oddCountFound) {
            length += 1;
        }
        
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LongestPalindrome lp = new LongestPalindrome();
        
        // Prompt the user for input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();  // Read user input
        
        // Calculate and display the longest palindrome length
        int result = lp.longestPalindrome(userInput);
        System.out.println("The length of the longest palindrome that can be built is: " + result);
        
        scanner.close(); // Close the scanner
    }
}
