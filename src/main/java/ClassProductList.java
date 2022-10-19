import java.util.*;

public class ClassProductList {

    ReminderVisitor reminderVisitor;

    List<Product> productList = new ArrayList<>();

    ClassProductList(){
        reminderVisitor = new ReminderVisitor();
    }

    public void accept(NodeVisitor visitor){
        visitor.visitProduct(this.productList.get(0));
    }

    public int size() {
        return productList.size();
    }
}
