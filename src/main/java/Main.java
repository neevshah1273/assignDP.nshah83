import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();


        Scanner scanner = new Scanner(System.in);




        while (true){
            System.out.println("Enter choice");
            System.out.println("1: Create User");
            System.out.println("2: Login");
            System.out.println("Anything else for exit");
            String string = scanner.nextLine();
            if(string.compareTo("1")==0){
                System.out.println("Enter Name of User");
                String username = scanner.nextLine();
                System.out.println("Enter Password of User");
                String passWord = scanner.nextLine();
                System.out.println("Enter User Type 0 For Buyer and 1 for seller");
                String type = scanner.nextLine();
                UserInfoItem temp = new UserInfoItem(username, passWord, type.equals("0")? false : true);
                facade.createUser(temp);
                System.out.println("Successfully Registered");
            }
            else if (string.equals("2")){
                if(facade.login()){
                    System.out.println("Successfully logged In!");
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
}

