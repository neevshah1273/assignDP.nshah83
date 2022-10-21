public class MeatProductMenu implements ProductMenu {

    ProductIterator productIterator;


    @Override
    public void showMenu() {
        System.out.println("Bridge Design Pattern called");
        productIterator = new ProductIterator(Facade.theProductList);
        while (productIterator.hasNext()){
            Product product = productIterator.Next();
            if(product.productType==0){
                System.out.println(product.productName);
            }
        }        System.out.println("Showing meat product menu");
    }

    @Override
    public void showAddButton() {
        System.out.println("showing meat product add button");
    }

    @Override
    public void showViewButton() {
        System.out.println("showing meat product view button");
    }

    @Override
    public void showRadioButton() {
        System.out.println("showing meat product radio button");
    }

    @Override
    public void showLabels() {
        System.out.println("showing meat product show labels");
    }

    @Override
    public void showComboxes() {
        System.out.println("showing meat product show combox");
    }
}
