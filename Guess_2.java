package Chapter_3;
// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess_2

{
    public static void main(String[] args)
    {
      int numToGuess;       //Number the user tries to guess
      int guess;            //The user's guess
      int numberOfGuesses = 0;
      int numHigh = 0;
      int numLow = 0;
  Scanner scan = new Scanner(System.in);
  Random generator = new Random();
         

  //randomly generate the  number to guess
numToGuess = generator.nextInt(9) + 1;

  //print message asking user to enter a guess
System.out.println("Enter your guess");
guess = scan.nextInt();
  //read in guess
                
  do  //keep going as long as the guess is wrong
        {
   
    System.out.println("Your guess was wrong guess again");
    if(guess > numToGuess)
    {  System.out.println("Your guess was to high");
    numHigh++;}
    else 
        {System.out.println("Your guess was to low");
    numLow++;}
        guess = scan.nextInt();
    numberOfGuesses++;
    }while ( guess != numToGuess);  
    //print message saying guess is wrong
      //get another guess from the user
  
System.out.println("Wow you got it right good job!!!!(loser)\n" +  "It took you " + numberOfGuesses + " guesses you suck!\n" + "You guessed to low "
    + numLow + " times" + " and guessed to high " + numHigh + " times \nYou are so bad");
  //print message saying guess is right
    }
}
