import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        reverseArray(arr);

        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");

        sc.close();
    }

    public static void reverseArray(int arr[]){
        int n = arr.length;
        int i = 0, j = n-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}