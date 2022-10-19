import java.util.HashMap;

public class Buyer extends Person{

    Buyer(String username, String password){
        super(username, password);
    }

    @Override
    public void showMenu() {

    }

    public ProductMenu CreateProductMenu(){
        return null;
    }
}
