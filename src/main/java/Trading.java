public class Trading {
    OfferingList offeringList = new OfferingList();

    public void accept(NodeVisitor visitor){
        visitor.visitTrading(this);
    }
}
