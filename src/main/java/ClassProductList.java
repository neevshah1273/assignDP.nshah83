import java.util.*;

public class ClassProductList extends ArrayList<Product> {

    ReminderVisitor reminderVisitor;




    ClassProductList(){
        reminderVisitor = new ReminderVisitor();
    }


    public void accept(NodeVisitor visitor){
        System.out.println("Accepting Visitor in ClassProductList");
        //visitor.visitProduct(this.productList.values());
    }



}
