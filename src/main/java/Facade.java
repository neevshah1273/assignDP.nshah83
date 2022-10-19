import java.util.Scanner;

public class Facade {

    private int userType;

    private Product theSelectedProduct;

    private int nProductCategory;

    private ClassProductList theProductList;

    private Person thePerson;

    PersonList personList = new PersonList();

    Login newLogin = new Login();


    public Boolean login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter UserName");
        String username = scanner.nextLine();
        System.out.println("Enter Password");
        String password = scanner.nextLine();
        return newLogin.newLoginAttempt(personList, username, password);
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
