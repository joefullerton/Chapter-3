package Chapter_3;

// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count2
{
  public static void main(String[] args)
  {
    String phrase; // a string of characters
    int countBlank; // the number of blanks (spaces) in the phrase
    int length; // the length of the phrase
    char ch; // an individual character in the string
    int counta = 0;
    int counte = 0;
    int countt = 0;
    int counts = 0;
    String quit = "hahah";
    Scanner scan = new Scanner(System.in);

    // Print a program header
    do
    {
      System.out.println("Character Counter");

      // Read in a string and find its length
      System.out.print("Enter a sentence or phrase: ");
      phrase = scan.nextLine();
      length = phrase.length();

      // Initialize counts
      countBlank = 0;

      // a for loop to go through the string character by character

      for (int i = 1; i < length; i++)
      {
        ch = phrase.toLowerCase().charAt(i);
        if (ch == ' ')
          countBlank++;
      }
      for (int e = 1; e < length; e++)
      {
        ch = phrase.toLowerCase().charAt(e);
        if (ch == 't')
          countt++;
      }
      for (int a = 1; a < length; a++)
      {
        ch = phrase.toLowerCase().charAt(a);
        if (ch == 'a')
          counta++;
      }
      for (int b = 1; b < length; b++)
      {
        ch = phrase.toLowerCase().charAt(b);
        if (ch == 's')
          counts++;
      }
      for (int f = 1; f < length; f++)
      {
        ch = phrase.toLowerCase().charAt(f);
        if (ch == 'e')
          counte++;
      }
    
   
    // and count the blank spaces

    // Print the results
    System.out.println("Number of t's: " + countt);
    System.out.println("Number of a's: " + counta);
    System.out.println("Number of s's: " + counts);
    System.out.println("Number of e's: " + counte);
    System.out.println("Number of blank spaces: " + countBlank);
    System.out
        .println("if you want to stop. input quit now or otherwise hit enter");
    quit = scan.nextLine();
    }
    while (!quit.equalsIgnoreCase("quit"));
    System.out.println("program has ended");
  }
}
