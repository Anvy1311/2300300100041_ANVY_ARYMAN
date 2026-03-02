import java.util.*;

public class FindMaximumRoatatedArray{
  
    public static int findMax(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            res = Math.max(res, arr[i]);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements in sorted manner");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(findMax(arr));
    }
}