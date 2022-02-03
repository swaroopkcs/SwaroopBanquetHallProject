package banquetHallNew;

public class BanquetWithTypes {
	double baseBookingCost;
	double costOfFood;
	double taxOnFood;
	double costOfBeverage;
	double taxOnBeverage;
	double tip;

	public BanquetWithTypes(double taxOnFood, double taxOnBeverage) {
		// TODO Auto-generated constructor stub
		this.taxOnFood = taxOnFood;
		this.taxOnBeverage = taxOnBeverage;
	}

	// setting the values for baseCost, costOfFood and costOfBeverage from
	// HallBillingClass
	public BanquetWithTypes(double baseBookingCost, double costOfFood, double costOfBeverage) {
		this.baseBookingCost = baseBookingCost;
		this.costOfFood = costOfFood;
		this.costOfBeverage = costOfBeverage;
	}

	double calculateBaseCost(double bookingBaseCost, double foodCost, double beverageCost, double tipPerc) {
		// calculating the base cost without tip per person
		double baseCostWoTip = bookingBaseCost + (foodCost * (100 + taxOnFood) / 100)
				+ (beverageCost * (100 + taxOnBeverage) / 100);
		double tipAmount = baseCostWoTip * tipPerc / 100;
		double baseCost = baseCostWoTip + tipAmount;
		return baseCost;
	}

	double calculateTax(double totalBaseCost) {
		// Assuming the tax on banquet halls as 18%
		double taxApplied = totalBaseCost * 18 / 100;
		return taxApplied;
	}

	double calculateCess(int numOfGuests, double billBeforeTax) {
		double serviceCess = 0;
		if (numOfGuests <= 40) {
			serviceCess = billBeforeTax * 4 / 100;
		} else if (numOfGuests > 40 && numOfGuests <= 80) {
			serviceCess = billBeforeTax * 8 / 100;
		} else if (numOfGuests > 80 && numOfGuests < 150) {
			serviceCess = billBeforeTax * 10 / 100;
		} else {
			serviceCess = billBeforeTax * 12.5 / 100;
		}
		return serviceCess;
	}

	void calcuateTheTotalCost(double baseCost, double tax, double cess, int numOfGuests) {
		double totalCost = (baseCost + tax + cess) * numOfGuests;
		System.out.println("The total cost will be: " + totalCost);
	}
}
