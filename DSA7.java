import java.util.*;
import java.util.Stack;

//
 class DSA7 {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        System.out.println("top:"+stack.peek());
        System.out.println("size:"+stack.size());
        System.out.println("popped:"+stack.pop());
        System.out.println("top:"+stack.peek());
        System.out.println("size:"+stack.size());
        System.out.println(stack.search(15));
        System.out.println(stack.search(10));
        System.out.println(stack.search(5));
        System.out.println(stack.search(20));
        while (stack.size()>0){
            System.out.println(stack.peek()+" ");
            stack.pop();
        }

    }
}
