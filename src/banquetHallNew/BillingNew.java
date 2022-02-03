package banquetHallNew;

import java.util.Scanner;

public class BillingNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to banquet hall");
		Scanner sc = new Scanner(System.in);
		// Setting the values for tax for food as 15% and beverages as 18%
		BanquetWithTypes banquet = new BanquetWithTypes(15.0, 18.0);
//		Setting the values for 3 plans on food and beverages
		BanquetWithTypes banquet1 = new BanquetWithTypes(14.99, 15.50, 10.50);
		BanquetWithTypes banquet2 = new BanquetWithTypes(19.99, 24.99, 14.99);
		BanquetWithTypes banquet3 = new BanquetWithTypes(24.99, 29.99, 19.99);
		String continueChoice = "";
		do {
			System.out.println("Please enter the number of Guests");
			int numOfGuests = sc.nextInt();
			if (numOfGuests >= 10) {
				System.out.println("Please enter the type of Banquet. Press 1 for Silver:" + "Press 2 for Gold: "
						+ "Press 3 for Platinum");
				int choice = sc.nextInt();
				System.out.println("Please enter the tip percentage");
				banquet.tip = sc.nextDouble();
				switch (choice) {
				case 1:
					double baseCost = banquet1.calculateBaseCost(banquet1.baseBookingCost, banquet1.costOfFood,
							banquet1.costOfBeverage, banquet.tip);
					double taxCalculated = banquet1.calculateTax(baseCost);
					double cess = banquet1.calculateCess(numOfGuests, baseCost);
					banquet1.calcuateTheTotalCost(baseCost, taxCalculated, cess, numOfGuests);
					break;
				case 2:
					baseCost = banquet2.calculateBaseCost(banquet2.baseBookingCost, banquet2.costOfFood,
							banquet2.costOfBeverage, banquet.tip);
					taxCalculated = banquet2.calculateTax(baseCost);
					cess = banquet2.calculateCess(numOfGuests, baseCost);
					banquet2.calcuateTheTotalCost(baseCost, taxCalculated, cess, numOfGuests);
					break;
				case 3:
					baseCost = banquet3.calculateBaseCost(banquet3.baseBookingCost, banquet3.costOfFood,
							banquet3.costOfBeverage, banquet.tip);
					taxCalculated = banquet3.calculateTax(baseCost);
					cess = banquet3.calculateCess(numOfGuests, baseCost);
					banquet3.calcuateTheTotalCost(baseCost, taxCalculated, cess, numOfGuests);
					break;
				default:
					System.out.println("Please enter a valid Banquet Code.");
				}
			} else {
				System.out.println("Minimum of 10 people are required for the banquet.");
			}
			System.out.println("Please enter Y to continue. Press anywhere else to exit.");
			continueChoice = sc.next();
		} while (continueChoice.equals("Y") || continueChoice.equals("y"));
		System.out.println("Thank you for using the billing system.");
		sc.close();
	}
}
