import java.util.Random;
import java.util.Scanner;

class Games {
    public int number;
    public int inputNumber;
    public int noGuesses;

    public int getNoGuesses() {
        return noGuesses;
    }
    public void setNoGuesses(int noGuesses){
        this.noGuesses=noGuesses;
    }
    Games(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        inputNumber= sc.nextInt();
    }
    boolean isCorrectNumber(){
        noGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right,it was %d \n you guessed it in %d attemps",number,noGuesses);
            return true;
        }
        else if (inputNumber<number){
            System.out.println("Too low--");
        }
        else if (inputNumber<number){
            System.out.println("too High--");
        }
        return false;
    }
}


public class practice82 {
    public static void main(String[] args) {
Games g=new Games();
boolean b=false;
while (!b){
    g.takeUserInput();
    b= g.isCorrectNumber();
}
    }
}
