import java.util.Scanner;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
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
            // Call the majorityElement method
            int majority = sol.majorityElement(nums);
            
            // Print the majority element
            System.out.println("The majority element is: " + majority);
        }
    }
}
