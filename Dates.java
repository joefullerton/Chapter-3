package Chapter_3;
// ****************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid          
// ****************************************************************
import java.util.Scanner;

public class Dates
{
    public static void main(String[] args)
    {
	int month, day, year;   //date read in from user
	int daysInMonth;        //number of days in month read in 
	boolean monthValid, yearValid, dayValid;  //true if input from user is valid
	boolean leapYear;       //true if user's year is a leap year
	dayValid = false;
	monthValid = false;
	yearValid = false;
	leapYear = false;
      Scanner scan = new Scanner(System.in);

	//Get integer month, day, and year from user
    System.out.println ("Imput integers for month, day, & year. Press enter after each: ");
    month = scan.nextInt();
    day = scan.nextInt();
    year = scan.nextInt();
	//Check to see if month is valid
    if (month >0 && month < 13)
    	  monthValid = true;
	//Check to see if year is valid
    if (year > 999 && year < 2000)
    	yearValid = true;
	//Determine whether it's a leap year
    if (year % 100 == 0 && year % 400 == 0)
    	leapYear = true;
    else
    	{
    	if (year % 100 == 0)
        	leapYear = false;
    	else 
    	{
    	if (year % 4 == 0)
    		leapYear = true;
    	
    	}}
    	
	//Determine number of days in month
    if (month % 2 == 0)
    	day = 31;
    else
    	day = 30;
    
	//User number of days in month to check to see if day is valid
    		if(leapYear == true && month == 2 && day == 29 || day == 30 || day == 31)
    	dayValid = false;
    if (day >= 1 && day <= 31 && dayValid == false)
    	dayValid = true;
    else 
    	dayValid = false;
    
	//Determine whether date is valid and print appropriate message
    if (dayValid = true && monthValid == true && yearValid == true)
    	System.out.println("Date is valid");
    else
    	System.out.println("Date is invalid");
    if (leapYear == true && dayValid == true && monthValid == true && yearValid == true)
    	System.out.println("Date is a leap year");
    else
    	System.out.println("Date is invalid");
    	
    }
}