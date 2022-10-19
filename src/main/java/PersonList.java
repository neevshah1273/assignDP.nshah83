import java.util.ArrayList;
import java.util.List;

public class PersonList {

    List<Person> personList = new ArrayList<>();

    void addi(Person person){
        this.personList.add(person);
    }

    public String pass(String username){
        for(int i=0;i<personList.size();i++){
            if(personList.get(i).username.equals(username)){
                return personList.get(i).password;
            }
        }
        return "";
    }
}
