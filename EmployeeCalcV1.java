import java.util.Scanner;

public class EmployeeCalcV1 {

	public static void main(String[] args) {

		// Declaring the variables 

		String nameOfEmployee;
		double numberOfHourWorked;
		double hourlyPayRate;
		double grossPay;

		System.out.println("Epmoloyee Payment Calculator V.1");
		System.out.println();
		System.out.println("Wellcome to Employee Calculator. Please follow the Instruction and provide appropiate imput.");
		System.out.println();
		System.out.println();

		// Taking an object reference for Scanning information from any Input system
		Scanner hrscan = new Scanner(System.in);

		// Getting the Input from users
		System.out.println("Enter Employee Name :");
		nameOfEmployee = hrscan.nextLine();
		System.out.println("Please Enter the Number of Total Hour Worked :");
		numberOfHourWorked = hrscan.nextDouble();
		System.out.println("Please Enter the Hourly Pay Rate Assign for this Employee :");
		hourlyPayRate = hrscan.nextDouble();

		// Process
		grossPay = numberOfHourWorked * hourlyPayRate;

		// Displaying output
		System.out.println();
		System.out.println("=============*====*=====*===========");
		System.out.println("Employee Name is : " + nameOfEmployee);
		System.out.println("Employee Total Hour is : " + numberOfHourWorked);
		System.out.println("Employee Hourly Rate is : " + hourlyPayRate);
		System.out.println("Employee Gross is : " + grossPay);
		System.out.println("=============*====*=====*===========");

		// Finishing Message 
		System.out.println("Thanks for Using Employee Payment Calculator");
		System.out.println("Press any key to exit");

	}

}
