package together;
import java.util.ArrayList;
import java.util.Scanner;
import interfaces.RegisterC;


public class Customer2 implements RegisterC {
	
	private String fname;
	private String lname;
	private String email;
	
	public Customer2() {
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		
	}
	
	Scanner entry = new Scanner(System.in);
	
	public ArrayList<Customer2> listCustomer2 = new ArrayList<Customer2>();

	@Override
	public void registerCustomer2() {
		
		Customer2 c2 = new Customer2();

        System.out.println("===== REGISTER CUSTOMER =====");

        System.out.println("FIRST NAME: ");
        c2.setFName(entry.nextLine());
        
        System.out.println("LAST NAME: ");
        c2.setLName(entry.nextLine());

        System.out.println("EMAIL: ");
        c2.setEmail(entry.nextLine());

        

        listCustomer2.add(c2);
		
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
