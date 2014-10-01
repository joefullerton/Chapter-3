package Chapter_3;

import java.util.Scanner;
// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************

public class LoveCS
{
    public static void main(String[] args)
    {
    final int LIMIT = 10;
	final int userEntry;
	int count = 1;
	int numbering;
	Scanner scan = new Scanner (System.in);
	System.out.print("Enter the amount of times: ");
	userEntry = scan.nextInt();
	while (count <= userEntry)
	{
	    numbering = (count);
		System.out.println(numbering + " I love Computer Science!!");
	    count++;
	}
    System.out.println("The message was printed " + userEntry
    + " times.");
    }
}