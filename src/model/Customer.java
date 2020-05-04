package model;
import java.util.ArrayList;
import java.util.Scanner;

import interfaces.RegisterC;

public class Customer implements RegisterC {
	
	// Attributes
	private String name;
	private String email;
	
	// Constructor
	public Customer() {}
	
	public ArrayList<Customer> customerList = new ArrayList<>();
	
	Scanner entry = new Scanner(System.in);
	
	@Override
	public void addCustomer() {
		
		Customer c1 = new Customer();
		
		System.out.println("..........::::: ADD NEW CUSTOMER :::::..........");
		
		customerList.add(c1);
			
	}
	

	@Override
	public Customer searchCustomer() {
		
		String email = null;
		Customer customer = null;
		Scanner entry = new Scanner(System.in);
		
		for (Customer c1 : customerList) {
			if (c1.getEmail().equalsIgnoreCase(email)) {
				System.out.println("Customer: "+ c1.getName() + " | " + "Cpf: "+ c1.getEmail());
				customer = c1;
				break;
			}
		}
		
		if (customer == null) {
			System.out.println("CUSTOMER NOT FOUND.");
		}
			return customer;
	}
	

	@Override
	public void deleteCustomer() {
		
	
		String choice = null;
		
		
		
		for (Customer c1 : customerList) {
			if (c1.getEmail().equalsIgnoreCase(email)) {
				System.out.println("Customer: "+ c1.getName() + " " + " | " + "CPF: "+ c1.getEmail());
			}
		}
		
		choice = Keyboard.input("DO YOU CONFIRM THAT WANT TO DELETE THIS CUSTOMER? (Y/N)");
		
		if (choice == "y") {
			customerList.remove(email);
		}
	}
	
	public String getName() {
        return name;
    }

    public void setName(String fname) {
        this.name = fname;
    }
               
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public ArrayList<Customer> getCustomerList() {
    	return customerList;
    }
    
    public void setCustomerList(ArrayList<Customer> customerList) {
    	this.customerList = customerList;
    }

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", customerList=" + customerList
				+ "]";
	} 
}
