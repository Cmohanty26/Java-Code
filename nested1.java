public class nested1 {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            // for (int j=1;j<=i;j++){
            //for (int j = 1; j <= n - i + 1; j++) {
                for (int j= 1; j <= n; j++) {
                    //System.out.print(j);
                    System.out.print(number+" ");
                    number++;
                }
                System.out.println();
            }
        }
    }
