
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import Main.Main;
//import Conta.Conta;

	public class Customer {

	    // Attributes
	    private String name;
	    private String email;
	    //private int membershipID;
	    //private int quantityOfRents;

	    // Constructor
	    public Customer() {
	        this.name = name;
	        this.email = email;
	        //this.membershipID = membershipID;
	        //this.quantityOfRents = quantityOfRents;
	    }

	    public ArrayList<Customer> listCustomer = new ArrayList<Customer>();

	    // Methods (Acoes ou Funcoes)
	    public void registerCustomer() {

	    	Customer c1 = new Customer();

	        System.out.println("===== REGISTER CUSTOMER =====");

	        c1.setName(Keyboard.input("NAME: "));

	        c1.setEmail(Keyboard.input("EMAIL: "));

	        listCustomer.add(c1);

	    }

	    public void searchCustomer() {

	        String email;
	        Customer customer = null;
	        email = Keyboard.input("TYPE EMAIL: ");

	        for (Customer c1 : listCustomer) {
	            if (c1.getEmail().equals(email)) {
	                System.out.println("Customer: "+ c1.getName() + " | " + "Email: " + c1.getEmail());
	                customer = c1;
	                break;
	            }
	        }
	        
	        if(customer == null) {
	        	System.out.println("CUSTOMER NOT FOUND.");
	        }
	    }

	    public void deleteCustomer() {

	        String email;
	        String choice = null;

	        email = Keyboard.input("TYPE EMAIL: ");

	        for (Customer c1 : listCustomer) {
	            if (c1.getEmail().equals(email)) {
	                System.out.println("Customer: "+ c1.getName() + " | " + "Email: "+c1.getEmail());
	            }
	        }

	        choice = Keyboard.input("CONFIRM YOU WANT TO DELETE THIS CUSTOMER?(Y/N)");

	        if (choice == "y") {
	            listCustomer.remove(email);
	        }
	        
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

		public ArrayList<Customer> getListCustomer() {
			return listCustomer;
		}

		public void setListCustomer(ArrayList<Customer> listCustomer) {
			this.listCustomer = listCustomer;
		}

		@Override
		public String toString() {
			return "Customer [name=" + name + ", email=" + email + "]";
		}
	}



