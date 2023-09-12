package ArrayString;
import java.util.Scanner;
public class rotate {
    //Time complexity - O(n) Except main method
    //Space complexity - O(1) Except main method
    public static void reverse(int[] arr,int begin, int end) {
        while(begin<end) {
            int temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
    }
    public static void rotateArray(int[] arr, int n,int k) {
        k %= n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        rotateArray(arr,n,k);

        System.out.print("Resultant array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}