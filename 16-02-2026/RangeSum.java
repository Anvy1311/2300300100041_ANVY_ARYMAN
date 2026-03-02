import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements, elements and Query");
        int n = sc.nextInt();
        int arr[] = new int[n]; 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int queries = sc.nextInt();
        int Q[][] = new int[queries][2];

        for (int i = 0; i < queries; i++) {
            for (int j = 0; j < 2; j++) {
                Q[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < queries; i++) {
            int L = Q[i][0];
            int R = Q[i][1];
            System.out.println(rangeSum(arr, L, R));
        }

        sc.close();
    }

    public static int rangeSum(int arr[], int L, int R) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        if (L == 0) {
            return prefix[R];
        }

        return prefix[R] - prefix[L - 1];
    }
}