import java.util.*;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        while (j < n) {
            nums[j++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements");
        int n = sc.nextInt();
        int nums[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Before: " + Arrays.toString(nums));

        moveZeroes(nums);

        System.out.println("After:  " + Arrays.toString(nums));
    }
}