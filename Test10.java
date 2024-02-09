public class Test10 {
    static long factorial(int num){
        long result;
        if (num==1) return 1;
        result=factorial(num-1)*num;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5");
        System.out.println(Test10.factorial(5));
    }
}
