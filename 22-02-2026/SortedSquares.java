import java.util.*;
public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements in sorted manner");
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println("Original Array: " + Arrays.toString(nums));

        int[] result = sortedSquares(nums);

        System.out.println("Sorted Squares:  " + Arrays.toString(result));
    }
}