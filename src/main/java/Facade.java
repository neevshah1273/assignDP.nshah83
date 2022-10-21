import java.io.IOException;
import java.util.Scanner;

public class Facade {

    private int userType;

    private Product theSelectedProduct;

    private int nProductCategory;

    public static ClassProductList theProductList = new ClassProductList();

    private Person thePerson;

    PersonList personList = new PersonList();

    Login newLogin = new Login();

    Scanner scanner = new Scanner(System.in);

    Facade() throws IOException {
        AllFileReader fileReader = new AllFileReader();
        fileReader.read(personList, theProductList);
    }

    public void showOperations(){
        while (true){
            System.out.println("Enter choice");
            System.out.println("1: Create User");
            System.out.println("2: Login");
            System.out.println("Anything else for exit");
            String string = scanner.nextLine();
            if(string.compareTo("1")==0){
                this.createUser();
                System.out.println("Successfully Registered");
            }
            else if (string.equals("2")){
                if(this.login()){
                    System.out.println("Successfully logged In!");
                    thePerson.showMenu();
                    break;
                }
                else {
                    System.out.println("Eh! Unsuccessful attempt");
                }
            }
            else{
                break;
            }
        }
    }

    public Boolean login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter UserName");
        String username = scanner.nextLine();
        System.out.println("Enter Password");
        String password = scanner.nextLine();
        Person person = newLogin.newLoginAttempt(personList, username, password);
        if(person!=null){
            thePerson=person;
            return true;
        }
        return false;
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

    public void createUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of User");
        String username = scanner.nextLine();
        System.out.println("Enter Password of User");
        String passWord = scanner.nextLine();
        System.out.println("Enter User Type 0 For Buyer and 1 for seller");
        String type = scanner.nextLine();
        UserInfoItem userInfoItem = new UserInfoItem(username, passWord, type.equals("0"));
        Person person;
        if(userInfoItem.userType){
            person = new Buyer(userInfoItem.name, userInfoItem.password);
        }
        else{
            person = new Seller(userInfoItem.name, userInfoItem.password);
        }
        personList.addi(person);
    }

    public void createProductList(){

    }

    public void AttachProductToUser(){

    }

    public Product SelectProduct(){
        return new Product("Test Product",0);
    }

    public void productOperation(){

    }

}
