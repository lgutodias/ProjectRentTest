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
		Customer2 c2 = new Customer2();
		Product film = new Product();

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
		                        c2.registerCustomer2();
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
		                    	film.locaFilm();
		                    	break;

		                    default:
		                        System.out.println("Invalid option.");
		                        break;
		                }            
		            } while (menu == 0);}
		        


	}


