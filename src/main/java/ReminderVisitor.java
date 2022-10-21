public class ReminderVisitor extends NodeVisitor{

    /*
    * Visitor Design pattern Implemented
    */

    @Override
    public void visitProduct(Product product) {
        System.out.println("Visiting product");
        System.out.println("visitor design pattern implemented");
    }

    @Override
    public void visitTrading(Trading trading) {
        System.out.println("Visiting trading");
        System.out.println("visitor design pattern implemented");
    }

    @Override
    public void visitFacade(Facade facade) {
        System.out.println("Vising facade");
        System.out.println("visitor design pattern implemented");
    }
}
