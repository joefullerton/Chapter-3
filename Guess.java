package Chapter_3;
// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
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
System.out.println("enter your guess");
guess = scan.nextInt();
	//read in guess
                
	while ( guess != numToGuess)  //keep going as long as the guess is wrong
        {
	 
	  System.out.println("your guess was wrong guess again");
	  if(guess > numToGuess)
	  {  System.out.println("your guess was to high");
	  numHigh++;}
	  else 
        {System.out.println("your guess was to low");
	  numLow++;}
        guess = scan.nextInt();
	  numberOfGuesses++;
	  
	  //print message saying guess is wrong
	    //get another guess from the user
	}
System.out.println("wow you got it right good job!!!!(loser)\n" +  "it took you " + numberOfGuesses + " guesses you suck!\n" + "you guessed to low "
    + numLow + " times" + " and guessed to high " + numHigh + " times \n you are so bad");
	//print message saying guess is right
    }
}
