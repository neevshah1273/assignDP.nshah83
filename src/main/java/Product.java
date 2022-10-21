public class Product {

    String productName;
    int productType;

    Trading trading = new Trading();

    Product(String productName, int productType){
        this.productName=productName;
        this.productType=productType;
    }
}
