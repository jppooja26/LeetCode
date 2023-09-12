package ArrayString;
import java.util.Scanner;

public class stock1 {
    public static int buySell(int[] arr, int n) {
        //Time complexity - O(n)
        //Space complexity - O(1)
        int maxProfit = Integer.MIN_VALUE;
        int minimum = arr[0];
        for(int i=1;i<n;i++) {
            int cost = arr[i] - minimum;
            maxProfit = Math.max(maxProfit,cost);
            minimum = Math.min(minimum,arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array of prices: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int val = buySell(arr,n);
        System.out.print("Best buy and sell profit: "+val);
        sc.close();
    }
}
