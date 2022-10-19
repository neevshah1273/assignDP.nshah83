import java.util.ArrayList;
import java.util.List;

public class PersonList {

    List<Person> personList = new ArrayList<>();

    void addi(Person person){
        this.personList.add(person);
    }
}
