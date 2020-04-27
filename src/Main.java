import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import Customer.Customer;
//import Product.Product;

public class Main {

	public static void main(String[] args) {

		Scanner entry = new Scanner(System.in);
		Customer c1 = new Customer();
		Product film = new Product();
		
		// ----------- Default Customer  ----------
		Customer john = new Customer();
		john.setName("John");
		john.setEmail("john@gmail.com");
		// Adding default customer 
		c1.getListCustomer().add(john);
		
		// ----------- Default Film ---------------
		Product spiderMan = new Product();
		spiderMan.setTitle("Spider Man");
		spiderMan.setGenere("Action");
		spiderMan.setYear(2020);
		spiderMan.setRentalPrice(2.0);
		// Adding default film
		film.getListFilm().add(spiderMan);
		
		// Just showing default customer and film to test
		System.out.println("=============== Customer ==================");
		System.out.println(c1.getListCustomer().get(0));
		System.out.println("================== Filme ==================");
		System.out.println(film.getListFilm().get(0));
		System.out.println("===========================================");

		int menu = 0;
		int option = 0;

		do {
			System.out.println("===== ULTRA VISION RENTAL SHOP =====");
			System.out.println("1 - REGISTER CUSTOMER");
			System.out.println("2 - SEARCH CUSTOMER");
			System.out.println("3 - DELETE CUSTOMER");
			System.out.println("4 - REGISTER FILM");
			System.out.println("5 - SEARCH FILM");
			option = entry.nextInt();

		                switch (option) {

		                    case 1:
		                        c1.registerCustomer();
		                        break;

		                    case 2:
		                        c1.searchCustomer();
		                        break;

		                    case 3:
		                        c1.deleteCustomer();
		                        break;

		                    case 4:
		                        film.registerFilm();
		                        break;
		                        
		                    case 5:
		                    	film.locaFilm(c1.getListCustomer());

		                    default:
		                        System.out.println("Invalid option.");
		                        break;
		                }            
		            } while (menu == 0);}
		        


	}


