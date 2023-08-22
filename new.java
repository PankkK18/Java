package com.company;
import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int inputnumber;
    public int numberOfGuesses = 10;

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

     game(){
        Random rand = new Random();
        this.number =rand.nextInt(15);
    }
    void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt(15);

    }
    boolean isCorrectNumber(){
        if(inputnumber==number){
            System.out.println(" Yes you guess it right %d" );
            return true;
        }
       else if(inputnumber<number){
            System.out.println("Too low ....");
        }
       else if (inputnumber>number){
            System.out.println("Too high....");
        }
        return false;
    }


}
public class CWH_50_exercise3 {
    public static void main(String[] args) {
        boolean b = false;
        while(!b) {
            game g = new game();
            g.takeUserInput();
           b = g.isCorrectNumber();

        }
    }
}
