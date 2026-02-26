import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size, target and elements in sorted in manner");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int target = sc.nextInt();
        
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int res[] = twoSum(arr, target);

        System.err.println(res[0] + " , " + res[1]);
    }

    public static int[] twoSum(int arr[], int target){

        int n = arr.length;
        int res[] = new int[2];
        int i = 0, j =n-1;

        while(i < j){
            if(arr[i] + arr[j] == target){
                res[0] = i;
                res[1] = j;
                return res;
            }


            else if(arr[i] + arr[j] < target)
                i++;

            else
                j--;
        }

        return new int[]{-1,-1};
    }
}
