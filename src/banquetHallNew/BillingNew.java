package banquetHallNew;

import java.util.Scanner;

public class BillingNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to banquet hall");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of Guests");
		int numOfGuests = sc.nextInt();
		//Setting the values for tax for food as 15% and beverages as 18%
		BanquetWithTypes banquet = new BanquetWithTypes(15.0, 18.0);
//		BanquetWithTypes banquet1 = new Banquet(14.99, 15.50, 10.50);
//		BanquetWithTypes banquet2 = new Banquet(19.99, 24.99, 14.99);
//		BanquetWithTypes banquet3 = new Banquet(24.99, 29.99, 19.99);
		if(numOfGuests>=10) {
//			System.out.println("Please enter the type of Banquet. Press 1 for Silver:"
//					+ "Press 2 for Gold "
//					+ "Press 3 for Platinum");
//			int choice = sc.nextInt();
//			System.out.println("Please enter the tip percentage");
//			double tipPer = banquet.tip;
//			switch (choice) {
//			case 1:

	}
	}
}
