package together;
import java.util.ArrayList;
import java.util.Scanner;
import interfaces.RegisterC;

public class Customer implements RegisterC {

	private String fname;
	private String lname;
	private String email;

	public Customer() {

		this.fname = fname;
		this.lname = lname;
		this.email = email;

	}

	Scanner entry = new Scanner(System.in);

	public ArrayList<Customer> customerList = new ArrayList<Customer>();

	@Override
	public void addCustomer() {
		Customer c1 = new Customer();

        System.out.println("===== REGISTER CUSTOMER =====");

        System.out.println("FIRST NAME: ");
        c1.setFName(entry.nextLine());
        
        System.out.println("LAST NAME: ");
        c1.setLName(entry.nextLine());

        System.out.println("EMAIL: ");
        c1.setEmail(entry.nextLine());

        customerList.add(c1);
	}

	@Override
	public void searchCustomer() {

        System.out.println("TYPE EMAIL: ");

        email = entry.nextLine(); 

        for (Customer c1 : customerList) {
            if (c1.getEmail().equals(email)) {
                System.out.println("Customer: "+ c1.getFName() + " " + c1.getLName() + " | " + "Email: "+ c1.getEmail());
                return;
            } else {
            	System.out.println("CUSTOMER NOT FOUND.");
            }
        }       
	}

	@Override
	public void deleteCustomer() {
		
		String email;
        String choice;
        Customer customer = null;

        System.out.println("TYPE EMAIL: ");
        email = entry.nextLine();

        for (Customer c1 : customerList) {
            if (c1.getEmail().equals(email)) {
                System.out.println("Customer: " + c1.getFName() + " " + c1.getLName() + " | " + "Email: " + c1.getEmail());
                customer = c1;
                break;
            }
        }

        System.out.println("CONFIRM YOU WANT TO DELETE THIS CUSTOMER?(Y/N) ");
        choice = entry.nextLine();

        if (choice.equalsIgnoreCase("y")) {
        	customerList.remove(customer);
            System.out.println("CUSTOMER HAS BEEN DELETED");
        }
        else {
            return;
        }
        return;
    }
	
	
	
	
	
	public Scanner getEntry() {
        return entry;
    }

    public void setEntry(Scanner entry) {
        this.entry = entry;
    }
    
    public String getFName() {
        return fname;
    }

    public void setFName(String fname) {
        this.fname = fname;
    }
    
    public String getLName() {
        return lname;
    }

    public void setLName(String lname) {
        this.lname = lname;
    }
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
