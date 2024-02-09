import java.util.Random;
import java.util.Scanner;

public class pratices64 {
    public static void main(String[] args) {
        //0 for Rock
        //1 for Paper
        //2 for Scissor
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for paper,2 for Scissor");
        int userInput= sc.nextInt();
        Random random=new Random();
        int ComputerInput=random.nextInt(3);
        if (userInput==ComputerInput){
            System.out.println("Draw");

        }
        else if (userInput==0 && ComputerInput==2 || userInput==1 && ComputerInput==0 || userInput==2 && ComputerInput==1){
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer win!");
        }
        if (ComputerInput==0){
            System.out.println("Computer choice:Rock");
        }
        else if (ComputerInput==1){
            System.out.println("Computer choice:Paper");
        }
        else if (ComputerInput==2){
            System.out.println("Computer choice:Scissor");
        }
    }
}