import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;
public class DSA12 {//largest rectangle  area under a histogram
    static int maxArea(int[]arr,int n){
        int res=0;
        for (int i=0;i<=n;i++){
            int count=1;
            for (int j=i-1;j>=0;j--){
                if (arr[j]>=arr[i])
                    count++;
                else
                    break;
            }
            int temp=count*arr[i];
            res=Math.max(res,temp);
        }
        return res;
    }
    //Driver code
    public static void main(String[] args) {
        int [] arr={1,3,4,4,1,5,8};
        int n=7;
        System.out.println("Max Area:"+maxArea(arr,n));
    }
}
