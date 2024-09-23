import java.util.Scanner;

class ransomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get ransomNote input from user
        System.out.print("Enter the ransom note: ");
        String ransomNote = scanner.nextLine();

        // Get magazine input from user
        System.out.print("Enter the magazine text: ");
        String magazine = scanner.nextLine();

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the canConstruct method and display the result
        boolean result = solution.canConstruct(ransomNote, magazine);
        if (result) {
            System.out.println("The ransom note can be constructed from the magazine.");
        } else {
            System.out.println("The ransom note cannot be constructed from the magazine.");
        }

        scanner.close();
    }
}
