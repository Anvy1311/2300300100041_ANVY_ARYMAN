import java.util.*;

public class SegregateEvenOdd {
    public static void segregateEvenOdd(int[] arr) {
        int n = arr.length;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
        }

        Collections.sort(even);
        Collections.sort(odd);

        int index = 0;
        for (int num : even)
            arr[index++] = num;

        for (int num : odd)
            arr[index++] = num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Before: " + Arrays.toString(arr));

        segregateEvenOdd(arr);

        System.out.println("After:  " + Arrays.toString(arr));
    }
}