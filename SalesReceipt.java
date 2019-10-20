import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SalesReceipt {

	// All Global Variable

	static String nameOfCustomer;
	static String nameOfProduct;
	static int itemQuantity;
	static double itemPrice;
	static double grossAmount;
	static double discountedPrice;
	static double tax;
	static double netPay;

	// Declaring the main module : Welcome

	public static void wellCome() {
		System.out.println("================================");
		System.out.println("Wellcome to ABC Supermarket");
		System.out.println();
		System.out.println("**Sales Receipt**");
		System.out.println();

		SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM yyyy hh:mm aa");
		Date date = new Date(System.currentTimeMillis());
		System.out.println("Date & Time : " + formatter.format(date));
		System.out.println();
		System.out.println("================================");

	}

	public static void getInput() {

		// Taking an object reference for Scanning information from any Input system
		Scanner abcscan = new Scanner(System.in);

		System.out.println("Enter Customer's Name ");
		nameOfCustomer = abcscan.nextLine();
		
		System.out.println("Enter Product Name ");
		nameOfProduct = abcscan.nextLine();

		System.out.println("Number of products ");
		itemQuantity = abcscan.nextInt();

		System.out.println("Item's Price");
		itemPrice = abcscan.nextDouble();

	}

	public static void calculateTotalPrice() {
		// Process
		grossAmount = itemPrice * itemQuantity;
	}

	public static void calculateDiscountedPrice() {

		if (grossAmount > 0 && grossAmount < 100) {
			discountedPrice = grossAmount;
		} else if (grossAmount >= 100 && grossAmount < 500) {
			discountedPrice = grossAmount - 10;
		} else if (grossAmount >= 500 && grossAmount < 1000) {
			discountedPrice = grossAmount - 20;
		} else if (grossAmount >= 1000) {
			discountedPrice = grossAmount - 30;
		}

		else
		System.out.println("Invalid Input: Cannot Calculate Sales Receipt");

	}

	public static void calculateTax() {

		tax = (grossAmount * 8.75) / 100;
	}

	public static void displayOutput() {

		// Displaying output
		System.out.println();
		System.out.println("=============*====*=====*===========");
		System.out.println("Customer Name is : " + nameOfCustomer);
		System.out.println("Product Name is : " + nameOfProduct);
		System.out.println("Item Quantity is : " + itemQuantity);
		System.out.println("Item Price is : " + itemPrice);
		System.out.println("Gross Amount is: " + grossAmount);
		System.out.println("Discount is :" + (grossAmount - discountedPrice));
		System.out.println("Price after discount is : " + discountedPrice);
		System.out.println("Tax :" + tax);
		System.out.println("Final Price is :" + (grossAmount - (grossAmount - discountedPrice) + tax));
		System.out.println("=============*====*=====*===========");

	}

	public static void exitProgram() {
		System.out.println();
		System.out.println("Thank You for Shopping with ABC Supermarket");
		System.out.println();

	}

	public static void main(String[] args) {
		wellCome();

		for (int i = 0; i < 3; i++) {
			System.out.println("Customer: " + (i + 1));

			getInput();
			calculateTotalPrice();
			calculateDiscountedPrice();
			calculateTax();
			displayOutput();

			String continueShopping;
			Scanner opScanner = new Scanner(System.in);
			System.out.println("Do you want to Continue Shopping? (Y or N)");
			continueShopping = opScanner.nextLine();

			if (continueShopping.equals("N")) {
				break;
			}
			exitProgram();
		}

		

	}
}
