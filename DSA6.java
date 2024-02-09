//stack implementation method4
import java.util.*;
public class DSA6 {
    public static void main(String[] args) {
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println("top:"+stack.peek());
        System.out.println("size:"+stack.size());
        System.out.println("popped:"+stack.pop());
        System.out.println("top:"+stack.peek());
        System.out.println("size:"+stack.size());
        for (Integer integer:stack) {
            System.out.println(integer + " ");
        }
        System.out.println(stack.contains(12));
        System.out.println(stack.contains(5));
        System.out.println("popped:"+stack.pop());
        System.out.println("popped:"+stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println("popped:"+stack.pop());
        System.out.println(stack.isEmpty());


    }
}
