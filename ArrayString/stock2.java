package ArrayString;

import java.util.Scanner;

public class stock2 {
    public static int buySell(int[] arr, int n) {
        //Time complexity - O(n)
        //Space complexity - O(1)
        int profit = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array of prices: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val = buySell(arr, n);
        System.out.print("Best buy and sell profit: " + val);
        sc.close();
    }
}
