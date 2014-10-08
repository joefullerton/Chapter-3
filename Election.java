package Chapter_3;
// ***************************************************************
//   Election.java
//
//   This file contains a program that tallies the results of
//   an election.  It reads in the number of votes for each of
//   two candidates in each of several precincts.  It determines
//   the total number of votes received by each candidate, the
//   percent of votes received by each candidate, the number of 
//   precincts each candidate carries, and the 
//   maximum winning margin in a precinct.
// **************************************************************

import java.util.Scanner;
import java.text.NumberFormat;
public class Election
{
    public static void main (String[] args)
    {
      NumberFormat percent = NumberFormat.getPercentInstance();

      int votesForPolly;  // number of votes for Polly in each precinct
	int votesForErnest; // number of votes for Ernest in each precinct
	int totalPolly = 0;     // running total of votes for Polly
	int totalErnest = 0;    // running total of votes for Ernest
	String response = "y";    // answer (y or n) to the "more precincts" question
	double total = 0;
	double avgP; 
	double avgE; 
	int ePreWin = 0;
	int pPreWin = 0;
	int ties = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println ("Election Day Vote Counting Program");
	
	do
	{
	 System.out.println("how many votes for Polly in this precinct");
	 votesForPolly = scan.nextInt();
	 totalPolly += votesForPolly;
	 System.out.println("how many votes for Ernest in this precinct");
	 votesForErnest = scan.nextInt();
	 totalErnest += votesForErnest;
	 if(votesForPolly > votesForErnest)
	   pPreWin++;
	 else
	   ePreWin++;
	 if(votesForPolly == votesForErnest)
	   {
	   ePreWin--;
	   ties++;
	   }
	  System.out.println("is there another presinct to count (y or n)");
	  response = scan.next();
	}
	while(response.equalsIgnoreCase("y"));
	
	total = totalPolly + totalErnest ;
	avgP = (totalPolly / (total));
	avgE = (totalErnest / (total));
	System.out.println("Pollys percentage = " + percent.format(avgP));
	System.out.println("Ernests percentage = " + percent.format(avgE));
	System.out.println("Total votes =" + total);
	System.out.println("Polly won " + pPreWin + " precincts");
	System.out.println("Ernest won " + ePreWin + " precincts");
	System.out.println("there was " + ties + " ties");
	// Initializations

	// Loop to "process" the votes in each precinct

	// Print out the results
    }
}