public class Facade {

    private int userType;

    private Product theSelectedProduct;

    private int nProductCategory;

    private ClassProductList theProductList;

    private Person thePerson;

    PersonList personList = new PersonList();

    public Boolean login(){
        return true;
    }

    public void addTrading(){

    }

    public void viewTrading(){

    }

    public void decideBidding(){

    }

    public void discussBidding(){

    }

    public void submitBidding(){

    }

    public void remind(){

    }

    public void createUser(UserInfoItem userinfoitem){
        if(userinfoitem.userType){
            Person person = new Buyer(userinfoitem.name, userinfoitem.password);
            personList.addi(person);
        }
        else{
            Person person = new Seller(userinfoitem.name, userinfoitem.password);
            this.personList.addi(person);
        }
    }

    public void createProductList(){

    }

    public void AttachProductToUser(){

    }

    public Product SelectProduct(){
        return new Product();
    }

    public void productOperation(){

    }

}
