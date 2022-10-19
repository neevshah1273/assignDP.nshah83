import java.util.HashMap;
import java.util.Map;

public abstract class Person {
    public ProductMenu theProductMenu;

    public Map<String, String> map = new HashMap<>();

    public String username;

    public String password;

    Person(String username, String password){
        this.username=username;
        this.password = password;

    }


    public abstract void showMenu();

    public void showAddButton(){

    }

    public void showViewButton(){

    }

    public void showRadioButton(){

    }

    public void showLabels(){

    }
}
