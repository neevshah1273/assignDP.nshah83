import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;

public class ProductIterator {

    ClassProductList productList;


    Iterator iterator;

    ProductIterator(ClassProductList productList){
        System.out.println("Iterator design pattern in use");
        this.productList=productList;
        iterator = productList.listIterator();
    }

    int index=0;

    public boolean hasNext(){
        return iterator.hasNext();
    }

    public Product Next(){
        return (Product) iterator.next();

    }

    public void MoveToHead(){
        iterator = ((List<?>) this.productList).listIterator();
    }

    public void Remove(Offering offering){
        iterator.remove();
    }

}
