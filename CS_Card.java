import java.util.Scanner;
import java.text.NumberFormat;

public class CS_Card {

	public static void main(String[] args) {
	double preBalance = 0; 
	double newBalance = 0;
	double interest = 0;
	double additionalCharges = 0;
	NumberFormat money = NumberFormat.getCurrencyInstance(); 
	Scanner scan = new Scanner(System.in);
	
	System.out.print("input previous balcance");
	preBalance = scan.nextDouble();
	System.out.print("input total amount of additional charges");
	newBalance = scan.nextDouble(); 
	additionalCharges = newBalance;
	newBalance = preBalance + newBalance ;  
		if (preBalance != 0)
			{
			interest = ((preBalance + newBalance) * .02 );
			newBalance = newBalance + interest ; 
			}
		
		if (newBalance < 50)
			System.out.println("CS CARD International Statement\n\n"
					+ "===============================\n\n"
					+ "Previous Balance:	"+ money.format(preBalance) + "\n\n"
					+ "Additional Charges:	" + money.format(additionalCharges) +  "\n\n"
					+ "Interest:		" + money.format(interest) + "\n\n"
					+ "New Balance:		" + money.format(newBalance) + "\n\n"
					+ "Minimum Payment:	" + money.format(newBalance));
		
		if (newBalance >= 50 && newBalance <= 300)
		System.out.println("CS CARD International Statement\n\n"
							+ "===============================\n\n"
							+ "Previous Balance:	"+ money.format(preBalance) + "\n\n"
							+ "Additional Charges:	" +money.format( additionalCharges) +  "\n\n"
							+ "Interest:		"  + money.format(interest) + "\n\n"
							+ "New Balance:		" + money.format(newBalance) + "\n\n"
							+ "Minimum Payment:	 $50.00\n\n");
		
		if (newBalance > 300)
		System.out.println("CS CARD International Statement\n\n"
					+ "===============================\n\n"
					+ "Previous Balance:	"+ money.format(preBalance) + "\n\n"
					+ "Additional Charges:	" + money.format(additionalCharges) +  "\n\n"
					+ "Interest:		"  + money.format(interest) + "\n\n"
					+ "New Balance:		" + money.format(newBalance) + "\n\n"
					+ "Minimum Payment:	" + money.format((newBalance * .2)));

	}

	
}


