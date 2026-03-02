import java.util.*;
public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println(reverseNumber(n));

        sc.close();
    }

    public static int reverseNumber(int n){
        int res = 0;

        while(n > 0){
            int rem = n % 10;
            res = res * 10 + rem;
            n /= 10;
        }

        return res;
    }
}