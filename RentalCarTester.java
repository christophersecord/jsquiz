/**
 *  Tests the Car and RentalCarCompany classes.
 * 
 * @author Akeem Richard
 * @version 1.0
 * 
 * COP5007 Project 2
 * File Name: RentalCarTester.java
 */

public class RentalCarTester {
	
	public static void main(String[] args) {

		String companyName = "Shady's Car Lot";
		
		RentalCarCompany rentalCarCompany = new RentalCarCompany(companyName);
		
		
		rentalCarCompany.addReservation("Justin", 123, "Bentley", "Subcompact", 25.99, 10);
		rentalCarCompany.addReservation("Jarrod", 456, "Cherokee", "Compact", 30.99, 8);
		rentalCarCompany.addReservation("Mary", 789, "Dodge", "Mid-size", 35.99, 5);
		rentalCarCompany.addReservation();
		rentalCarCompany.printReservations();
		rentalCarCompany.printSalesReport();
		
		rentalCarCompany.findReservation(8746);
		rentalCarCompany.findReservation(123);
		
		/*
		 * Testing the default constructor for RentalCarCompany
		 */
		RentalCarCompany rentalCarCompany0 = new RentalCarCompany();
		rentalCarCompany0.printReservations();
		
	}
	
}