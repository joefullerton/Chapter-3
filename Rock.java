package Chapter_3;
// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Rock
{
    public static void main(String[] args)
    {
	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay = "a";  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number used to determine
	int infinateloop = 1;                    
      Scanner scan = new Scanner(System.in);
	Random generator = new Random();
while (infinateloop >= 1)
{
	//Get player's play -- note that this is stored as a string
	System.out.print("input your play sir or madam as R, P, or S");
	personPlay = scan.next();
	
	//Generate computer's play (0,1,2)
	computerInt = generator.nextInt(3);
	//Translate computer's randomly generated play to string
	switch (computerInt)
	{
	case 0:System.out.println("the computers play is R");
	computerPlay = "R";
	break;
	case 1:System.out.println("the computers play is P");
	computerPlay = "P";
	break;
	case 2:System.out.println("the computers play is S");
	computerPlay = "S";
	break;
	}

	
	//See who won.  Use nested ifs instead of &&.
	if (personPlay.equalsIgnoreCase(computerPlay))  
	    System.out.println("It's a tie!\n\n\n");
	else 
		if (personPlay.equalsIgnoreCase("R"))
		{ if (computerPlay.equalsIgnoreCase("S"))
	    	System.out.println("Rock crushes scissors.  You win!!\n\n\n");
		}
		else
		if(personPlay.equalsIgnoreCase("S"))
 		{if(computerPlay.equalsIgnoreCase("P"))
  			System.out.println("scissors cuts paper. you win!!\n\n\n");
 		}
 		else
		if(personPlay.equalsIgnoreCase("P"))
	 	{ if(computerPlay.equalsIgnoreCase("R"))
   			System.out.println("paper covers rock. you win!!\n\n\n");
	 	}
	 	
		if (personPlay.equalsIgnoreCase("S"))
		{ if (computerPlay.equalsIgnoreCase("R"))
			System.out.println("Rock crushes scissors.  You Lose..\n\n\n");
		}
		else
		if(personPlay.equalsIgnoreCase("P"))
		{ if(computerPlay.equalsIgnoreCase("S"))
  			System.out.println("scissors cuts paper. you Lose..\n\n\n");
		}
		else
		if(personPlay.equalsIgnoreCase("R"))
		if(computerPlay.equalsIgnoreCase("P"))
	 		System.out.println("paper covers rock. you Lose..\n\n\n");
}	
		//...  Fill in rest of code
    }
}