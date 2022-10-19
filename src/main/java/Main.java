import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();


        Scanner scanner = new Scanner(System.in);



        while (true){
            System.out.println("Enter choice");
            System.out.println("1: Create User");
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
                System.out.println(temp.name);

                facade.createUser(temp);
                System.out.println("Successfully Registered");
            }
            else{
                break;
            }

        }

    }
}

