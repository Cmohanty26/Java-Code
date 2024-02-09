import java.util.Scanner;
public class pratices5 {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the week no");
        x= sc.nextInt();
        if (x==1){
            System.out.println("sunday");
            }
        else{
            if (x==2){
                System.out.println("monday");
            }
            else{
                if (x==3){
                    System.out.println("tuesday");
                }
                else {
                    if (x==4){
                        System.out.println("wednesday");
                    }
                    else{
                        if (x==5){
                            System.out.println("thursday");
                        }
                        else {
                            if (x==6){
                                System.out.println("friday");
                            }
                            else{
                                if (x==7){
                                    System.out.println("saturday");
                                }
                                else
                                    System.out.println("it is not a day no");
                            }
                        }
                    }
                }
            }

        }

    }
}
