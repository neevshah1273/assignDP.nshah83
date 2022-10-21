public class PersonFactory {
    public Person createNewPerson(UserInfoItem userInfoItem){
        System.out.println("Factory design pattern implemented");
        Person person;
        if(userInfoItem.userType){
            person = new Buyer(userInfoItem.name, userInfoItem.password);
        }
        else{
            person = new Seller(userInfoItem.name, userInfoItem.password);
        }
        return person;
    }
}
