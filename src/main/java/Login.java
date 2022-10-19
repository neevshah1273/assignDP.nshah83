public class Login {

    Person person;



    public boolean newLoginAttempt(PersonList personList, String username, String password){
        return personList.pass(username).equals(password);
    }
}
