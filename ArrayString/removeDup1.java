//Time complexity - O(n)
//Space complexity - O(1)
package ArrayString;
import java.util.Scanner;

public class removeDup1 {
    public static int removeDuplicates(int[] arr) {
        int index = 1;
        for(int i = 1;i<arr.length;i++) {
            if(arr[i]!=arr[index]) {
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
        int k = removeDuplicates(arr);
        System.out.print("Altered array: ");
        for(int i=0;i<k;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
