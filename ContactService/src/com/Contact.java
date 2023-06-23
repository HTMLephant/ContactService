/* 
 * Author: Matthew Cochrane
 * 
 * Class: CS 320
 *
 */


package com;

public class Contact {
	private String Id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String streetAddress;
	
	// constructor 
	public Contact(String Id, String firstName, String lastName, String phoneNumber, String streetAddress) {
		if(Id == null || Id.length() > 10) {
			throw new IllegalArgumentException("Bad ID");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Bad first name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Bad last name");
		}
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Bad phone number");
		}
		if (streetAddress == null || streetAddress.length() > 30) {
			throw new IllegalArgumentException("Bad address");
		}
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.streetAddress = streetAddress;
	}
	
	
	// getters
	public String getId() {
		return Id;
	}
	
	public String getFirst() {
		return firstName;
	}
	
	public String getLast() {
		return lastName;
	}
	
	public String getNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return streetAddress;
	}
	
	
	public void setFirst(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid name input");
		}
		this.firstName = firstName;
	}
	
	public void setLast(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid name input");
		}
		this.lastName = lastName;
	}
	
	public void setNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid name input");
		}
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String streetAddress) {
		if (streetAddress == null || streetAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid name input");
		}
		this.streetAddress = streetAddress;
	}
	
	
}
