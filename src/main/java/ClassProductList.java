import java.util.*;

public class ClassProductList {

    ReminderVisitor reminderVisitor;

    List<Product> productList = new ArrayList<>();

    ClassProductList(){
        reminderVisitor = new ReminderVisitor();
    }

    public void addi(Product product){
        productList.add(product);
    }

    public void accept(NodeVisitor visitor){
        System.out.println("Accepting Visitor in ClassProductList");
        visitor.visitProduct(this.productList.get(0));
    }

}
