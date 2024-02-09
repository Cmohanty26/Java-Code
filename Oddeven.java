public class Oddeven {
    public static void main(String[] args) {
        int count=1;
        int number=4;
        int maxvalue=29;
        while (number<=maxvalue){
            number++;
            if (!OddNumbercheck(number)){
                continue;
            }
            System.out.println(number);
        }
    }
    public static boolean OddNumbercheck(int number){
        if (number%2==1){
            return true;
        }
        else {
            return false;
        }
    }
}
