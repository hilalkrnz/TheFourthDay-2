package Entities;

import java.time.LocalDate;


public class Customer {
	
	public int ID;
	public String firstName;
	public String lastName;
	public LocalDate DateOfBirth;
	public long nationalID;
	
	
	public Customer() {
	}


	public Customer(int iD, String firstName, String lastName, LocalDate dateOfBirth, long nationalID) {
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = dateOfBirth;
		this.nationalID = nationalID;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}


	public long getNationalID() {
		return nationalID;
	}


	public void setNationalID(long nationalID) {
		this.nationalID = nationalID;
	}
	
	
	
	

}
