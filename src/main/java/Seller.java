public class Seller extends Person{
    @Override
    public void showMenu() {

    }

    public ProductMenu CreateProductMenu(){
        return new ProductMenu();
    }
}
