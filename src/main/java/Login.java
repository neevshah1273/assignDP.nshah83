public class Login {

    Person person;



    public Person newLoginAttempt(PersonList personList, String username, String password){
        Person person = personList.pass(username);
        if(person==null)return null;
        if(person.password.equals(password)){
            return person;
        }
        return null;
    }
}
