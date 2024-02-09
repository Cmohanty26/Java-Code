public class pratices24 {
    public static void main(String[] args) {
        int year=1996;
        boolean leap=false;
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    leap=true;

                }
                else
                    leap=false;

            }
        }
    }
}
