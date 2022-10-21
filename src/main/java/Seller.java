import java.util.Scanner;

public class Seller extends Person{

    Scanner scanner = new Scanner(System.in);

    Seller(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        /*
         *
         * Bridge Pattern
         *
         */
        System.out.println("Hello Dear Seller");
        System.out.println("which Menu would you like to see?");
        System.out.println("0-> Produce Product Menu");
        System.out.println("1-> Meat Product Menu");
        System.out.println("Press any other key for exit");
        String selectedOption = scanner.nextLine();
        if(selectedOption.equals("0")){
            this.theProductMenu.showMenu();
        }
        else if(selectedOption.equals("1")){
            this.theProductMenu.showMenu();
        }
        return;
    }

    public ProductMenu CreateProductMenu(){
        System.out.println("press 0 for produce product menu, press 1 for create product menu");
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        ProductMenu productMenu;
        if(next.equals("0")){
            productMenu = new ProduceProductMenu();
        }
        else{
            productMenu = new MeatProductMenu();
        }
        this.theProductMenu=productMenu;
        return productMenu;
    }
}
