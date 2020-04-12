
import java.util.ArrayList;
import java.util.Date;
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

        Customer c1 = new Customer();

        System.out.println("===== RENT FILM =====\n");
        System.out.println("TYPE THE FILM'S NAME: ");
        nameFilm = entry.nextLine();

        for (Product film : listFilm) {
            if (film.getTitle().equals(nameFilm)) {
                System.out.println(".::: A PESQUISA ENCONTROU :::." + 
            "\n TITLE: " + getTitle() + 
            "\n YEAR: " + getYear() + 
            "\n GENERE " + getGenere() + 
            "\n PRICE: " + getRentalPrice());

            }
        }
        System.out.println("FILM NOT FOUND.");

        if (!("FILM NOT FOUND".equals(nameFilm))) {

            System.out.println("WOULD YOU LIKE TO RENT THIS FILM? ");
            

            String option = null;

            switch (option) {
            case "s":
            case "S":
                System.out.println("TYPE THE CUSTOMER'S E-MAIL: ");
                String cpfCustomer = entry.nextLine();

                for (Customer pc1 : c1.listCustomer) {
                    if (c1.getEmail().equals(c1.getEmail())) {
                        System.out.println(".::: A PESQUISA ENCONTROU :::." + 
                    "\n NOME: " + c1.getName() + 
                    "\n CPF: " + c1.getEmail());
                    //"\n ENDERECO: " + c1.getEndereco() + 
                    //"\n TELEFONE: " + c1.getTelefone());

                    }
                }
                System.out.println("CUSTOMER NOT FOUND.");

                if (!("CUSTOMER NOT FOUND.".equals(cpfCustomer))) {


                }

                break;

            case "n":
            case "N":


            default:
                System.out.println("APERTE APENAS S PARA SIM OU N PARA NAO.");
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