
public class ProduceProductMenu implements ProductMenu {

    ProductIterator productIterator;

    @Override
    public void showMenu() {

        System.out.println("Bride Design Pattern called");
        productIterator = new ProductIterator(Facade.theProductList);
        while (productIterator.hasNext()){
            Product product = productIterator.Next();
            if(product.productType==1){
                System.out.println(product.productName);
            }
        }
        /*
         *
         *Factory Method
         *
         */
        System.out.println("Showing produce product menu");
    }

    @Override
    public void showAddButton() {
        System.out.println("showing produce product add button");
    }

    @Override
    public void showViewButton() {
        System.out.println("showing produce product view button");
    }

    @Override
    public void showRadioButton() {
        System.out.println("showing produce product radio button");
    }

    @Override
    public void showLabels() {
        System.out.println("showing produce product show labels");
    }

    @Override
    public void showComboxes() {
        System.out.println("showing produce product show combox");
    }
}
