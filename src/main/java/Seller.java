public class Seller extends Person{
    Seller(String username, String password) {
//        System.out.println("Seller"+username+password);
        super(username, password);
    }

    @Override
    public void showMenu() {

    }

    public ProductMenu CreateProductMenu(){
        return null;
    }
}
