package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	Scanner sc = new Scanner(System.in);
	ContactDetails address = new ContactDetails();
	List<ContactDetails> person = new ArrayList<ContactDetails>();

	public void addDetails() {

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

	}

	// View all existing person

	public void printDetails() {

		for (ContactDetails addPerson : person) {
			System.out.println(addPerson);
		}
		System.out.println("\n\n");

	}

	// edit contact
	public void editContact() {

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
	}

	// delete person

	public void deletePerson() {
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

	}

	// Removing the duplicate VALUES from Map
	public void removeDuplicateValue() {
		HashMap<String, AddressBookMain> bookMap = new HashMap<String, AddressBookMain>();

		System.out.println("\n After removing duplicate values ");

		for (Object key1 : bookMap.keySet()) {

			for (Object key2 : bookMap.keySet()) {
				if (!key1.toString().equals(key2.toString())) {
					AddressBookMain x = bookMap.get(key1);
					AddressBookMain y = bookMap.get(key2);
					if (x == y) {
						bookMap.remove(key2);
					}
				}

			}

		}
	}

	public String sortByName() {
		Collections.sort(this.person, (person1, person2) -> (person1.getFirstName().compareTo(person2.getFirstName())));
		System.out.println("\n[*]\tEntries sorted by name successfully");
		return null;
	}
}
