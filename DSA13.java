import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;
public class DSA13 {//Next greater element in an array
    static ArrayList<String>nextGreater(int[] arr,int size){
        ArrayList<String>list=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        s.add(arr[size-1] );
        list.add(" ");
        for (int i=size-2;i>=0;i--){
            while (!s.isEmpty() && s.peek()<=arr[i])
                s.pop();
            String res=s.isEmpty() ? "_":Integer.toString(s.peek());
            list.add(res);
            s.add(arr[i] );
        }
       // Collection.(list);
        return list;
    }
    //Driver code
    public static void main(String[] args) {
        int[]arr={30,50,20,15,25};
        int size=arr.length;
        for (String x:nextGreater(arr, arr.length)){
            System.out.println(x+" ");
        }
    }

}
