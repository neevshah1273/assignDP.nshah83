public class Buyer extends Person{
    @Override
    public void showMenu() {

    }

    public ProductMenu CreateProductMenu(){
        return new ProductMenu();
    }
}
