import java.util.*;

public class OddAppearingElement {
    public static int findOdd(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 1) {
                mid--;
            }

            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            }

            else {
                high = mid;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements in sorted manner with one odd appearing element");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Array: " + Arrays.toString(arr));

        int oddElement = findOdd(arr);

        System.out.println("Odd appearing element: " + oddElement);
    }
}