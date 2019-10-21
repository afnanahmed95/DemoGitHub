import java.util.Scanner;

public class EmployeeCalcV2 {


	// All Global Variable 

	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static double grossPay; 
	static double netPay;


	// Declaring the main module : Wellcome 
	public static void wellCome() {

		System.out.println("Epmoloyee Payment Calculator V.2");
		System.out.println();
		System.out.println("Wellcome to Employee Calculator. Please follow the Instruction and provide appropiate imput.");
		System.out.println();
		System.out.println();
	}
	public static void getInput() {

		// Taking an object reference for Scanning information from any Input system
		Scanner hrscan = new Scanner(System.in);

		// Getting the Input from users
		System.out.println("Enter Employee Name :");
		nameOfEmployee = hrscan.nextLine();
		System.out.println("Please Enter the Number of Total Hour Worked :");
		numberOfHourWorked = hrscan.nextDouble();
		System.out.println("Please Enter the Hourly Pay Rate Assign for this Employee :");
		hourlyPayRate = hrscan.nextDouble();

	}
	public static void calculateGrossPay() {
		// Process
		grossPay = numberOfHourWorked * hourlyPayRate;
	}
	public static void calculateNetPay() {

		if(grossPay>0 && grossPay<=1500) {

			netPay = grossPay - (grossPay*10)/100;
		}	else if(grossPay>1500 && grossPay<=3000) {
			netPay = grossPay - (grossPay*20)/100;
		}    
		else if(grossPay>3000 &&  grossPay<=4500 ) {
			netPay = grossPay - (grossPay*30)/100;
		} else if(grossPay>4500 &&  grossPay<=6000 ) {
			netPay = grossPay - (grossPay*40)/100;
		} else if(grossPay > 6000  ) {
			netPay = grossPay - (grossPay*50)/100;
		} 
		else {
			netPay = 0;
			System.out.println("Invalid Input Captured!!!!"); 



		}

	}
	public static void displayOutput() {
		// Displaying output
		System.out.println();
		System.out.println("=============*====*=====*===========");
		System.out.println("Employee Name is : " + nameOfEmployee);
		System.out.println("Employee Total Hour is : " + numberOfHourWorked);
		System.out.println("Employee Hourly Rate is : " + hourlyPayRate);
		System.out.println("Employee Gross is : " + grossPay);
		System.out.println("Employee NetPay is : " + netPay);
		System.out.println("=============*====*=====*===========");
		System.out.println();
	}	
	public static void exitProgram() {

		// Finishing Message 
		System.out.println("Thanks for Using Employee Payment Calculator");
		System.out.println();
	}
	public static void main(String[] args) {



		wellCome();
		getInput();
		calculateGrossPay();
		calculateNetPay();
		displayOutput();
		exitProgram();

	}
}
