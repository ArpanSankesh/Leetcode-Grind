import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        // Read the size of the array
        try (Scanner scanner = new Scanner(System.in)) {
            // Read the size of the array
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            
            // Read the array elements
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            
            // Read the target value
            System.out.print("Enter the target value: ");
            int target = scanner.nextInt();
            
            // Create an instance of Solution and get the result
            Solution solution = new Solution();
            int[] result = solution.twoSum(nums, target);
            
            // Print the result
            if (result.length == 0) {
                System.out.println("No two sum solution found.");
            } else {
                System.out.println("Indices of the two numbers are: [" + result[0] + ", " + result[1] + "]");
            }
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // No solution found
    }
}
