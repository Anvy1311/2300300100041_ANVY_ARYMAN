import java.util.*;

public class FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = leftIndex(nums, target);
        res[1] = rightIndex(nums, target);
        return res;
    }

    public static int leftIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static int rightIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                low = mid + 1; 
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size, target and elements in sorted manner");
        int n = sc.nextInt();
        int nums[] = new int[n];
        int target = sc.nextInt();

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println("Array:  " + Arrays.toString(nums));
        System.out.println("Target: " + target);

        int[] result = searchRange(nums, target);

        System.out.println("Result: " + Arrays.toString(result));
    }
}