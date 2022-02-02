package banquetHall;

import java.util.Scanner;

public class HallBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to banquet hall");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of Guests");
		int numOfGuests = sc.nextInt();
		//Setting the values for tax for food as 15% and beverages as 18%
		Banquet banquet = new Banquet(15.0, 18.0);
		if(numOfGuests>=10) {
			//Assigning the values for the variables in Banquet Class
			System.out.println("Please enter the base cost for the banquet: ");
			banquet.baseBookingCost = sc.nextDouble();
			System.out.println("Please enter the cost of food: ");
			banquet.costOfFood = sc.nextDouble();
			System.out.println("Please enter the cost of beverages: ");
			banquet.costOfBeverage = sc.nextDouble();
			System.out.println("Please enter the tip percentage: ");
			banquet.tip = sc.nextDouble();
			//calculating the base cost from the values entered
			double baseCost = banquet.calculateBaseCost(banquet.baseBookingCost, banquet.costOfFood, banquet.costOfBeverage, banquet.tip);
			System.out.println(baseCost);
			double taxAmount = banquet.calculateTax(baseCost);
			System.out.println(taxAmount);
			double cess = banquet.calculateCess(numOfGuests, baseCost);
			System.out.println(cess);
			banquet.calcuateTheTotalCost(baseCost, taxAmount, cess, numOfGuests);
//			}
		}
		else {
			System.out.println("The minimum number of guests permitted is 10");
		}
		sc.close();
	}

}
