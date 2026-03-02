import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size, target and elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int target = sc.nextInt();
        
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int res = linearSearch(arr, target);

        System.err.println(res);
    }

    public static int linearSearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target)
                return i;
        }

        return -1;
    }
}
