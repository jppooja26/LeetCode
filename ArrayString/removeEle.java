//Time complexity - O(n)
//Space complexity - O(n) 
package ArrayString;
import java.util.Scanner;
public class removeEle {
    public static int remove(int[] arr, int n, int k) {
        int index = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] != k) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
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
        System.out.print("Enter value to be removed: ");
        int k = sc.nextInt();
        int index = remove(arr,n,k);
        System.out.print("Altered array: ");
        for(int i=0;i<index;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
