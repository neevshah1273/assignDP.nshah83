import java.util.*;

public class ClassProductList {

    ReminderVisitor reminderVisitor;

    List<Product> productList = new ArrayList<>();

    ClassProductList(){
        reminderVisitor = new ReminderVisitor();
    }

    public void accept(NodeVisitor visitor){

    }
}
