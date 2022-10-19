import java.util.HashMap;
import java.util.Scanner;

public class Buyer extends Person{

    Buyer(String username, String password){
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("Showing menu of buyer");
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
