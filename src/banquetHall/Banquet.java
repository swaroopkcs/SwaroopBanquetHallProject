package banquetHall;

public class Banquet {
	double baseBookingCost;
	double costOfFood;
	double taxOnFood;
	double costOfBeverage;
	double taxOnBeverage;
	double tip;

	//Setting the values for tax on food and beverages from HallBilling Class
	public Banquet(double taxOnFood, double taxOnBeverage) {
		this.taxOnFood = taxOnFood;
		this.taxOnBeverage = taxOnBeverage;
	}

	double calculateBaseCost(double bookingBaseCost, double foodCost, double beverageCost, double tipPerc, int numOfGuests) {
		//calculating the base cost without tip per person
		double baseCostWoTip = bookingBaseCost + ((foodCost*(100+taxOnFood)/100) + (beverageCost*(100+taxOnBeverage)/100)*numOfGuests);
		double tipAmount = baseCostWoTip * tipPerc / 100;
		//base cost with tip
		double baseCost = baseCostWoTip + tipAmount;
		return baseCost;
	}

	double calculateTax(double totalBaseCost) {
		// Assuming the tax on banquet halls as 18%. Assuming tax applied on base cost per person
		double taxApplied = totalBaseCost * 18 / 100;
		return taxApplied;
	}

	double calculateCess(int numOfGuests, double billBeforeTax) {
		//bill before tax taken as the total base cost per person
		double serviceCess = 0;
		double cessPerc = 0;
		if (numOfGuests <= 40) {
			cessPerc = 4;
		} else if (numOfGuests > 40 && numOfGuests <= 80) {
			cessPerc = 8;
		} else if (numOfGuests > 80 && numOfGuests < 150) {
			cessPerc = 10;
		} else {
			cessPerc = 12.5;
		}
		serviceCess = billBeforeTax * cessPerc / 100;
		return serviceCess;
	}
	void calcuateTheTotalCost(double baseCost, double tax, double cess) {
		//calculating the total base cost and calculating the price for the whole group
		double totalCost = (baseCost+tax+cess);
		System.out.println("The total cost will be:          "+totalCost);
	}

}
