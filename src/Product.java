
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import Customer.Customer;


public class Product {
	
	
	Scanner entry = new Scanner(System.in);
		  
	public ArrayList<Product> listFilm = new ArrayList<Product>();
	
    //List<Product> listFilm = new ArrayList<Product>();

    private String title;
    private int year;
    private String genere;
    private double rentalPrice;

    public Product() {

        this.title = title;
        this.year = year;
        this.genere = genere;
        this.rentalPrice = rentalPrice;
    }

    

    //Acoes ou Metodos (Funcoes)
    public void registerFilm() {
    	Product film = new Product();
        System.out.println("===== REGISTER FILM =====");

        System.out.println("TITLE: ");
        film.setTitle(entry.nextLine());

        System.out.println("GENERE: ");
        film.setGenere(entry.nextLine());

        System.out.println("YEAR: ");
        film.year = Integer.parseInt(entry.nextLine());

        System.out.println("RENTAL PRICE: ");
        film.rentalPrice = Double.parseDouble(entry.nextLine());

        listFilm.add(film);
    }

    public void locaFilm() {

        String nameFilm;
        boolean result;
        
        Customer c1 = new Customer();

        System.out.println("===== RENT FILM =====\n");
        System.out.println("TYPE THE FILM'S NAME: ");
        nameFilm = entry.nextLine();

        for (Product film : listFilm) {
            if (film.getTitle().equals(nameFilm)) {
                System.out.println(".::: A PESQUISA ENCONTROU :::." + 
            "\n TITLE: " + film.getTitle() + 
            "\n YEAR: " + film.getYear() + 
            "\n GENERE " + film.getGenere() + 
            "\n PRICE: " + film.getRentalPrice());
                
            }
        }
        System.out.println("FILM NOT FOUND.");

        if (!("FILM NOT FOUND".equals(nameFilm))) {

            System.out.println("WOULD YOU LIKE TO RENT THIS FILM? ");
            

            String option = null;

            switch (option) {
            case "y":
            case "Y":
                System.out.println("TYPE THE CUSTOMER'S E-MAIL: ");
                String emailCustomer = entry.nextLine();

                for (Customer C2 : c1.listCustomer) {
					if (c1.getEmail().equals(c1.getEmail())) {
                        System.out.println(".::: A PESQUISA ENCONTROU :::." + 
                    "\n NOME: " + c1.getName() + 
                    "\n EMAIL: " + c1.getEmail());
                    //"\n ENDERECO: " + c1.getEndereco() + 
                    //"\n TELEFONE: " + c1.getTelefone());
                       
                    }return;
				}
                System.out.println("CUSTOMER NOT FOUND.");

                if (!("CUSTOMER NOT FOUND.".equals(emailCustomer))) {


                }

                break;

            case "n":
            case "N":
            	break;
            	
            default:
                System.out.println("PRESS Y FOR YES OR N FOR NO.");
                break;
            }
            
        }
    }


    // Getters e Setters    
    public void setListaFilm(ArrayList<Product> listFilm) {
        this.listFilm = listFilm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
}