import java.util.*;

public class BuySellStock{
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > buy) {
                int profit = prices[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size and elements");
        int n = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("Prices: " + Arrays.toString(prices));

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}