import java.io.*;
import java.util.*;
public class dsa3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int ans = first(arr, 0, sc.nextInt());
        System.out.println(ans);
    }


    public static int first(int[] arr,int idx,int num) {
        if (idx == arr.length) {
            return -1;
        }
            if (num == arr[idx]) {
                return idx;

            }
            int ans = first(arr, idx + 1, num);
            return ans;
        }

}
