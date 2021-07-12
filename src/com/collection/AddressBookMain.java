package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBookMain {

	public static void main(String[] args) {

		List<ContactDetails> person = new ArrayList<ContactDetails>();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome To Address Book Problem\n\n" + "Choose your option:\n"
					+ "1. Create new person\n" + "2. View all the existing person\n" + "3. Edit The Exisiting array\n"
					+ "4. Remove The Person\n" + "5. Quit\n");
			int option = sc.nextInt();
			System.out.println();
			switch (option) {
			// Add New Contact
			case 1:
				ContactDetails address = new ContactDetails();

				System.out.print("Enter Your First Name: ");
				address.setFirstName(sc.next());

				System.out.print("Enter Your Last Name: ");
				address.setLastName(sc.next());

				System.out.print("Enter Your City: ");
				address.setCity(sc.next());

				System.out.print("Enter Your State Name: ");
				address.setState(sc.next());

				System.out.print("Enter Your Zip Code: ");
				address.setZip(sc.nextInt());

				System.out.print("Enter Your Phone Number: ");
				address.setPhoneNumber(sc.nextLong());

				System.out.print("Enter Your Email Id: ");
				address.setEmail(sc.next());

				person.add(address);

				break;

			}
		}
	}
}
