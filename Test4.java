
public class Test4 {
    public static void main(String[] args) {
        if (args.length !=2){
            System.out.println("Please enter values");
            return;
        }
        String s1=args[0];
        String s2=args[1];
        double d1=Double.parseDouble(s1);
        double d2=Double.parseDouble(s2);
        double d3=d1+d2;
        System.out.println("The sum= " +d3);
    }
}
