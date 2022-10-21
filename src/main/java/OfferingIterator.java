import java.util.Iterator;
import java.util.List;

public class OfferingIterator {

    /*
    *
    * Iterator Design Pattern
    *
    */

    OfferingList offeringList;
    Iterator iterator;

    OfferingIterator(OfferingList offeringList){
        System.out.println("Iterator design pattern in use");
        this.offeringList = offeringList;
        iterator = offeringList.listIterator();
    }



    public boolean hasNext(){
        return iterator.hasNext();
    }

    public Offering Next(){
        return (Offering) iterator.next();
    }

    public void MoveToHead(){
        iterator = offeringList.listIterator();
    }

    public void Remove(Offering offering){
        iterator.remove();
        return;
    }
}
