package Chapter_3;
import java.util.Scanner;
public class TemperatureActivities {

	public static void main(String[] args) {
		
		double temp;
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("Enter the temperature: ");
		temp = scan.nextDouble();
		if (temp >= 80 && temp <= 95)
			System.out.print ("Swimming!");
		if (temp >= 60 && temp < 80)
			System.out.print ("Tennis!");
		if (temp >= 40 && temp <60)
			System.out.print("Golf!");
		if (temp < 40 && temp >= 20)
			System.out.print("Skiing!");
		if (temp >95 || temp < 20)
			System.out.println("check out our shops!");
			
	}

}
