package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
//import Customer.Customer;

public class Product {

    public ArrayList<Product> listFilm = new ArrayList<Product>();

   

    private String title;
    private int year;
    private String genere;
    private double rentalPrice;
    private String email;
    private String option;
    
    public Product() {}

    //Acoes ou Metodos (Funcoes)
    public void registerFilm() {
    	Scanner entry = new Scanner(System.in);
    	Product film = new Product();
        System.out.println("===== REGISTER FILM =====");

        System.out.println("TITLE: ");

        System.out.println("GENERE: ");

        System.out.println("YEAR: ");

        System.out.println("RENTAL PRICE: ");

        listFilm.add(film);
    }

    public void locaFilm(ArrayList<Customer> customers) {

        String nameFilm;

        Customer c1 = null;
        Product p = null;

        System.out.println("===== RENT FILM =====\n");
        nameFilm = Keyboard.input("TYPE THE FILM'S NAME: ");

        for (Product film : listFilm) {
            if (film.getTitle().equalsIgnoreCase(nameFilm)) {
            	System.out.println(".::: A PESQUISA ENCONTROU :::." + 
            			"\n TITLE: " + film.getTitle() + 
            			"\n YEAR: " + film.getYear() + 
            			"\n GENERE " + film.getGenere() + 
            			"\n PRICE: " + film.getRentalPrice());
                
                p = film;
                System.out.println("<< Film encontrado >>");
                break;

            }
        }

        if (p != null) {
        	Scanner entry = new Scanner(System.in);
        	System.out.println("Name: " + p.title);
            
        	System.out.println("WOULD YOU LIKE TO RENT THIS FILM (y/n)? ");
            
           
			switch (option) {
            case "y":
            case "Y":
           
            	            	
                for (Customer customer : customers) {
                    if (customer.getEmail().equalsIgnoreCase(email)) {
                        System.out.println(".::: A PESQUISA ENCONTROU :::." + 
                    "\n NAME: " + customer.getName() + 
                    "\n CPF: " + customer.getEmail());
                    //"\n ENDERECO: " + c1.getEndereco() + 
                    //"\n TELEFONE: " + c1.getTelefone());
                        c1 = customer;
                        break;
                    }
                }
                

                if (c1 == null) {
                	System.out.println("CUSTOMER NOT FOUND.");
                } else {
                	// Para teste
                	System.out.println("Customer name: " + c1.getName());
                }

                break;

            case "n":
            case "N":


            default:
                System.out.println("PRESS Y FOR YES OR N FOR NO.");
                break;
            }
            
        } else {
        	System.out.println("FILME NOT FOUND");
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

	public ArrayList<Product> getListFilm() {
		return listFilm;
	}

	@Override
	public String toString() {
		return "Product [title=" + title + ", year=" + year + ", genere=" + genere + ", rentalPrice=" + rentalPrice
				+ "]";
	}
    
    
}