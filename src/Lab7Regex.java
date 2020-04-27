

import java.util.Scanner;

/*
 * 
 * Lab 7 Starter Project
 * 
 * 
 */

public class Lab7Regex {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();
		validateName(name);
		
		System.out.print("Please enter a valid Email Address: ");
		String email = scnr.nextLine();
		validateEmail(email);
		
		System.out.print("Please enter a valid Phone Number xxx-xxx-xxxx: ");
		String phoneNumber = scnr.nextLine();
		validatePhone(phoneNumber);
		
		System.out.print("Please enter a valid Date mm/dd/yyyy: ");
		String date = scnr.nextLine();
		validateDate(date);

		scnr.close();
	}

	public static boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Z][A-Za-z ]{1,29}";

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}

	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = "[A-Za-z0-9]{5,30}@[A-Za-z0-9]{3,10}\\.[A-Za-z0-9]{2,3}";

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		String regex = "[0-9]{3}-[0-9]{3}-[0-9]{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}
	
	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}
	
	

}
