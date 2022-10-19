public class ReminderVisitor extends NodeVisitor{
    @Override
    public void visitProduct(Product product) {
        System.out.println("Visiting product");
    }

    @Override
    public void visitTrading(Trading trading) {
        System.out.println("Visiting trading");
    }

    @Override
    public void visitFacade(Facade facade) {
        System.out.println("Vising facade");
    }
}
