import java.util.Scanner;
public class secondArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[row][cols];
        //input
        //row
        for (int i = 0; i < row; i++) {
            //cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        int x= sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j=0;j<cols;j++){
                //System.out.print(numbers[i][j]+" ");
                if (numbers[i][j]==x){
                    System.out.println("x found at location("+ i +", "+ j +")");
                }
            }
            //System.out.println();
        }
    }
}
