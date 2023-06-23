package com;

import java.util.*;

public class ContactService {

	private static Map<String, Contact> contacts;
	
	public ContactService() {
		contacts = new HashMap<>();
	}
	
	public boolean addContact(Contact contact) {
		// If ID exists already
		if(contacts.containsKey(contact.getId()) || contact.getId() == null) {
			throw new IllegalArgumentException("Contact already exists");
		}
		
		else {
			contacts.put(contact.getId(), contact);
			return true;
		}
		
	}
	
	public boolean deleteContact(String Id) {
		// iterate over existing contacts
		if (contacts.containsKey(Id)) {
			contacts.remove(Id);
			return true;
		}
		else {
			throw new IllegalArgumentException("ID not found");
		}
	}
	
	public boolean updateContact(String Id, String firstName, String lastName, String phoneNumber, String streetAddress) {
		// iterate over existing contacts
		if (!contacts.containsKey(Id)) {
			throw new IllegalArgumentException("Invalid ID");
		}
		else {	
			Contact contact = contacts.get(Id);
			contact.setFirst(firstName);
			contact.setLast(lastName);
			contact.setNumber(phoneNumber);
			contact.setAddress(streetAddress);
			return true;
		}
	}
	public Map<String, Contact> getContacts() {
		return contacts;
		
		
	}
	
}

