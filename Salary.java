package Chapter_3;
// ***************************************************************
//   Salary.java
//   Computes the raise and new salary for an employee
// ***************************************************************
import java.util.Scanner;

public class Salary
{


public static void main (String[] args)
{
      double currentSalary;  // current annual salary
      String rating;         // performance rating
      double raise = 0;          // dollar amount of the raise
      String Excellent = new String ("excellent");
      String Good = new String ("good");
      String Poor = new String ("poor");
	   Scanner scan = new Scanner(System.in);

      // Get the current salary and performance rating
      System.out.print ("Enter the current salary: ");
      currentSalary = scan.nextDouble();
      System.out.print ("Enter the performance rating: ");
      rating = scan.next();
      
      // Compute the raise -- Use if ... else ...
      if (rating .equalsIgnoreCase(Excellent))
      {raise = currentSalary + (currentSalary * .06);}
      	  else
      if (rating .equalsIgnoreCase(Good))
      {raise = currentSalary + (currentSalary * .04);}
    	  else
      if (rating .equals(Poor))
      {raise = currentSalary + (currentSalary * .015);}
      // Print the results
      System.out.println ("Amount of your raise: $" + (raise - currentSalary));
      System.out.println ("Your new salary: $" + (currentSalary + (raise - currentSalary)));
   }
}