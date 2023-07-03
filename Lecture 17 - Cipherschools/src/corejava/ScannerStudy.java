package corejava;
import java.util.Scanner;

public class ScannerStudy {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String firstName= sc.next();//it will take input till a space occurs
		String lastName = sc.next();
		
		System.out.println("Please enter your Profession");
		String profession = sc.next();
		System.out.println("Please enter your Address");
		
		String address = sc.next();
		System.out.println("Please enter your House number");
		int number = sc.nextInt();
		
		
		
		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		System.out.println("Profession:" + profession);
		System.out.println("Address:" + address);
		System.out.println("House number:" + number);
		
	}

}
