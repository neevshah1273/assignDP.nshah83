import java.util.HashMap;
import java.util.Map;

public abstract class Person {
    public ProductMenu theProductMenu;

    public Map<String, String> map = new HashMap<>();

    Person(String username, String password){
        System.out.println("Person"+username+password);
//        map.put(username, password);
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
