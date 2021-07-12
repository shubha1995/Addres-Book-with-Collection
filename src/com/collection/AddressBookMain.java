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

			// View all existing person
			case 2:

				for (ContactDetails addPerson : person) {
					System.out.println(addPerson);
				}
				System.out.println("\n\n");
				break;
			// edit existing contact
			case 3:
				System.out.println("Edit record");
				System.out.println("Enter name to edit:");

				String city = sc.next();

				for (int i = 0; i < person.size(); i++) {
					address = person.get(i);
					if (city.equals(address.getFirstName())) {
						System.out.println("Enter new city:");
						address.setCity(sc.next());
						System.out.println("List After edit is" + person.toString());
					}

				}

				break;
			// Remove person
			case 4:
				System.out.println("remove record");
				System.out.println("Enter name to remove:");
				for (int i = 0; i < person.size(); i++) {
					address = person.get(i);
					if (sc.next().equals(address.getFirstName())) {
						person.remove(address);
						System.out.println("List After removing" + person.toString());
					} else {
						System.out.println("User not found");
					}
				}
				break;

			case 5:
				return;

			}
		}
	}
}
