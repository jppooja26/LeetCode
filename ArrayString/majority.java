package ArrayString;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class majority {
    public static int occurance(int[] arr, int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int maxCount = Integer.MIN_VALUE;
        int element = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()>maxCount) {
                maxCount = entry.getValue();
                element = entry.getKey();
            }
        }
        return element;
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
        int k = occurance(arr,n);
        System.out.println("Element with highest occurance: "+k);
        sc.close();
    }
}
