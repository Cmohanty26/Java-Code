public class practice104 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println("The result is:"+c);
        }
        catch (Exception e){
            System.out.println("Sorry we failed to divide reason:");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
