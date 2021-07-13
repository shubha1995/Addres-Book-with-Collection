package com.collection;

import java.util.HashMap;
import java.util.Scanner;

public class AddressList {

	public static void main(String[] args) {
		AddressList addList = new AddressList();
		System.out.println("Want to add new AddressBook");
		Scanner sc = new Scanner(System.in);
		String AddressBookName = sc.next();

		addList.addAddresbookbyName(AddressBookName);

	}

	HashMap<String, AddressBookMain> bookMap = new HashMap<String, AddressBookMain>();

	private void addAddresbookbyName(String addressBookName) {

		Scanner s = new Scanner(System.in);
		AddressBookMain addressbookdetails = new AddressBookMain();

		while (true) {
			System.out.println("Welcome To Address Book Problem\n\n" + "Choose your option:\n"
					+ "1. Create new person\n" + "2. View all the existing person\n" + "3. Edit The Exisiting array\n"
					+ "4. Remove The Person\n" + "5. Add multiple addressbook\n" + "6. Remove duplicate value\n" + "7.Sort By Name\n");
			int option = s.nextInt();

			switch (option) {

			// Add New Contact

			case 1:
				addressbookdetails.addDetails();
				break;

			// Print existing contact

			case 2:
				addressbookdetails.printDetails();
				break;

			case 3:
				addressbookdetails.editContact();
				break;
			case 4:
				addressbookdetails.deletePerson();
				break;

			case 5:
				addressbookdetails.addDetails();
				break;
			case 6:
				addressbookdetails.removeDuplicateValue();
				break;
			case 7:
				addressbookdetails.sortByName();
				break;

			}

			bookMap.put(addressBookName, addressbookdetails);
		
			
			
				
		

		}
	}
}
