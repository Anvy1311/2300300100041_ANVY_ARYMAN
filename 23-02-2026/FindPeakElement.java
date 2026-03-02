import java.util.*;
public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return n - 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements");
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        
        System.out.println("Array: " + Arrays.toString(nums));

        int peakIndex = findPeakElement(nums);

        System.out.println("Peak Index: " + peakIndex);
        System.out.println("Peak Value: " + nums[peakIndex]);
    }
}