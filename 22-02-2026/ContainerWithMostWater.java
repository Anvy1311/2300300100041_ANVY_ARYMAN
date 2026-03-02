import java.util.*;

public class ContainerWithMostWater{
    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int maxContainer = 0;

        while (left < right) {
            int width = right - left;
            int water = Math.min(height[left], height[right]) * width;
            maxContainer = Math.max(maxContainer, water);

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxContainer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements");
        int n = sc.nextInt();
        int height[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println("Heights: " + Arrays.toString(height));

        int result = maxArea(height);

        System.out.println("Maximum Water Container Area: " + result);
    }
}