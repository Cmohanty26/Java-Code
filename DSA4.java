class Stack{
    static final int MAX=10;
    int top;
    int[] a=new int[MAX];
    Stack(){
        top=-1;
    }
    boolean push(int x){
        if (isfull()){
            System.out.println("stack overflow");
            return false;
        }
        else {
            a[++top]=x;
            System.out.println(x+"pushed into stack");
            return true;
        }
    }
    int pop(){
        if (isEmpty()){
            System.out.println("stack underflow");
            return  0;
        }
        else {
            int x=a[top--];
            return x;

        }
    }
    int peak(){
        if (top<0){
            System.out.println("stack underflow");
            return 0;
        }
        else {
            int x=a[top];
            return x;
        }
    }
    int size(){
        return (top+1);
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isfull(){
        return top==MAX-1;
    }
}
public class DSA4 {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.pop()+"popped from stack");
        System.out.println(s.size());
        System.out.println(s.peak()+"is top element");
        String result;
        System.out.println(result=(s.isEmpty())?"Stack is empty:":"stack is not empty");
        System.out.println(result=(s.isfull())?"stack is full":"stack is not null");
    }
}
