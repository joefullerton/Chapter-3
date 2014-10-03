package Chapter_3;

// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//          
// ****************************************************************
import java.util.Scanner;

public class PowersOf2
{
  public static void main(String[] args)
  {
    int numPowersOf2 = 1; // How many powers of 2 to compute
    int nextPowerOf2 = 0; // Current power of 2
    int exponent; // Exponent for current power of 2 -- this
    
    Scanner scan = new Scanner(System.in);

    System.out.println("How many powers of 2 would you like printed? ");
    exponent = scan.nextInt();
    // print a message saying how many powers of 2 will be printed
    System.out.print("Here are the first " + exponent + " powers of 2:");
    // initialize exponent -- the first thing printed is 2 to the what?

    System.out.println("\n 2 ^ " + nextPowerOf2 + " = " + numPowersOf2);

    nextPowerOf2 = 1;
    numPowersOf2 *= 2;

    while (nextPowerOf2 <= exponent)

    {
      // print out current power of 2

      
      System.out.println("2 ^ " + nextPowerOf2 + " = " + numPowersOf2);
     

      // find next power of 2 -- how do you get this from the last one?
      numPowersOf2 *= 2;
      // increment exponent
      nextPowerOf2++;

    }
  }
}