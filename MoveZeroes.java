import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // Pointer for the next position of the non-zero element

        // Iterate through the array with the right pointer
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap elements
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++; // Move the left pointer to the next position
            }
        }
    }

    public static void main(String[] args) {
        // Prompt the user to enter the size of the array
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the size of the array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            
            // Create an array to store the input numbers
            int[] nums = new int[size];
            
            // Prompt the user to enter the array elements
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                nums[i] = scanner.nextInt();
            }
            
            // Create an instance of the Solution class
            Solution sol = new Solution();
            // Call the moveZeroes method
            sol.moveZeroes(nums);
            
            // Print the modified array
            System.out.println("Array after moving zeroes to the end: " + Arrays.toString(nums));
        }
    }
}
