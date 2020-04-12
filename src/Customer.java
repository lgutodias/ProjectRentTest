
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

	    Scanner entry = new Scanner(System.in);

	    public ArrayList<Customer> listCustomer = new ArrayList<Customer>();

	    // Methods (Acoes ou Funcoes)
	    public void registerCustomer() {

	    	Customer c1 = new Customer();

	        System.out.println("===== REGISTER CUSTOMER =====");

	        System.out.println("NAME: ");
	        c1.setName(entry.nextLine());

	        System.out.println("EMAIL: ");
	        c1.setEmail(entry.nextLine());

	        //System.out.println("MEMBERSHIP ID: ");
	        //c1.setEndereco(entrada.nextLine());

	        //System.out.println("QUANTITY OF RENTS: ");
	        //cliente.setTelefone(entrada.nextLine());

	        listCustomer.add(c1);

	    }

	    public void searchCustomer() {

	        String email;
	        boolean result;

	        System.out.println("TYPE EMAIL: ");

	        email = entry.nextLine(); 

	        for (Customer c1 : listCustomer) {
	            if (c1.getEmail().equals(email)) {
	                System.out.println("Customer: "+ c1.getName() + " | " + "Email: " + c1.getEmail());
	                return;
	            }
	        }
	        System.out.println("CUSTOMER NOT FOUND.");
	    }

	    public void deleteCustomer() {

	        String email;
	        String choice = null;

	        System.out.println("TYPE EMAIL: ");
	        email = entry.nextLine();

	        for (Customer c1 : listCustomer) {
	            if (c1.getEmail().equals(email)) {
	                System.out.println("Customer: "+ c1.getName() + " | " + "Email: "+c1.getEmail());
	            }
	        }

	        System.out.println("CONFIRM YOU WANT TO DELETE THIS CUSTOMER?(Y/N) ");
	        choice = entry.nextLine();

	        if (choice == "y") {
	            listCustomer.remove(email);
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

	    /*public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }*/
	}



