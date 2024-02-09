public class Range {
    public static void main(String[] args) {
        int maxRange=Integer.MAX_VALUE;
        int minRange=Integer.MIN_VALUE;
        byte  maxRange1=Byte.MAX_VALUE;
        byte  minRange1=Byte.MIN_VALUE;
        long maxRange2=Long.MAX_VALUE;
        long minRange2=Long.MIN_VALUE;
        float maxRange3=Float.MAX_VALUE;
        float minRange3=Float.MIN_VALUE;
        char maxRange4= Character.MAX_VALUE;
        char minRange4= Character.MIN_VALUE;

        System.out.println("The max Range of  integer is:"+ maxRange);
        System.out.println("The min Range of  integer is:"+ minRange);
        System.out.println("The max Range of  byte is:"+ maxRange1);
        System.out.println("The min Range of  byte is:"+ minRange1);
        System.out.println("The max Range of  long is:"+ maxRange2);
        System.out.println("The min Range of  long is:"+ minRange2);
        System.out.println("The max Range of  float is:"+ maxRange3);
        System.out.println("The min Range of  float is:"+ minRange3);
        System.out.println("The max Range of  char is:"+ maxRange4);
        System.out.println("The min Range of  char is:"+ minRange4);
        int sum1=maxRange+1;
        int sum2=minRange-1;
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
