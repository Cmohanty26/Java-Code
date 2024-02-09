import java.util.Scanner;
public class natural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,i,sum=0;
        System.out.println("enter the any no:");
        number= sc.nextInt();
        for (i=1;i<=number;i++){
            if (i%2==0){
                sum=sum+i;

            }

        }
        System.out.println("the sum of even numbers is:"+number+"="+sum);


    }
}
