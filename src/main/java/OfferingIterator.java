import java.util.List;

public class OfferingIterator {

    /*
    *
    * Iterator Design Pattern
    *
    */

    List<Offering> offeringList;

    OfferingIterator(List<Offering> offeringList){
        this.offeringList = offeringList;
    }


    int index=0;

    public boolean hasNext(){
        return (index+1<=this.offeringList.size());
    }

    public Offering Next(){
        return this.offeringList.get(++index);
    }

    public void MoveToHead(){
        index=0;
    }

    public void Remove(Offering offering){
        this.offeringList.remove(offering);
    }
}
