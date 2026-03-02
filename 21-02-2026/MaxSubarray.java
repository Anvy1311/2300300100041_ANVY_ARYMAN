import java.util.*;
public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements");
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(nums));

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
} 
    

