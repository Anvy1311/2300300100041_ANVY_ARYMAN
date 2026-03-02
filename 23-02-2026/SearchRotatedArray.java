import java.util.*;
public class SearchRotatedArray {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
           
            else {
                if (nums[mid] < target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
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

        int index = search(nums, target);

        System.out.println("Index found: " + index);
    }
}