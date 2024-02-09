//Stack implementation method3
import java.io.*;
import java.util.*;

class stack2 {
    ArrayList<Integer>List=new ArrayList<>();
    void push(int x){
        List.add(x);
    }
    int pop(){
        int res= List.get(List.size()-1);
        List.remove(List.size()-1);
        return res;
    }
    int peak(){
        return List.get(List.size()-1);

    }
    int size(){
        return List.size();
    }
    boolean isEmpty(){
        return List.isEmpty();
    }

}
public class DSA5 {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peak());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peak());
        System.out.println(s.isEmpty()?"stack is empty":"stack is not empty");
        System.out.println(s.isfull()?"stack is full":"stack is not full");
    }
}