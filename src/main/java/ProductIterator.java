import java.util.List;

public class ProductIterator {

    List<Product> productList;

    ProductIterator(List<Product> productList){
        this.productList=productList;
    }

    int index=0;

    public boolean hasNext(){
        return (index+1<=productList.size());
    }

    public Product Next(){
        return productList.get(++index);
    }

    public void MoveToHead(){
        index=0;
    }

    public void Remove(Offering offering){
        productList.remove(offering);
    }

}
