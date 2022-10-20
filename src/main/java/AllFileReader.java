import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AllFileReader {

    public void read(PersonList personList, ClassProductList productList) throws IOException {
        File file = new File("src/main/java/BuyerInfo.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            int i=0;
            String username="";
            String password="";
            while (line.charAt(i)!=':'){
                username+=line.charAt(i);
                i++;
            }
            i++;
            while (i<line.length()){
                password+=line.charAt(i);
                i++;
            }
            UserInfoItem userInfoItem = new UserInfoItem(username, password, true);
            Person person = new Buyer(userInfoItem.name, userInfoItem.password);
            personList.addi(person);
        }
        sc.close();

        File sellerFile = new File("src/main/java/SellerInfo.txt");
        Scanner sellerScanner = new Scanner(sellerFile);
        while (sellerScanner.hasNextLine()) {
            String line = sellerScanner.nextLine();
            int i=0;
            String username="";
            String password="";
            while (line.charAt(i)!=':'){
                username += line.charAt(i);
                i++;
            }
            i++;
            while (i<line.length()){
                password+=line.charAt(i);
                i++;
            }
            UserInfoItem userInfoItem = new UserInfoItem(username, password, true);
            Person person = new Seller(userInfoItem.name, userInfoItem.password);
            personList.addi(person);
        }
        sellerScanner.close();

        File productFile = new File("src/main/java/ProductInfo.txt");
        Scanner productScanner = new Scanner(productFile);
        while (productScanner.hasNextLine()) {
            String line = productScanner.nextLine();
            int i=0;
            String type="";
            String productName="";
            while (line.charAt(i)!=':'){
                type += line.charAt(i);
                i++;
            }
            i++;
            while (i<line.length()){
                productName+=line.charAt(i);
                i++;
            }
            System.out.println(type + " " + productName);
            if(type.equals("Meat")){
                ProductMenu productMenu = new MeatProductMenu();
            }
            else if(type.equals("Produce")){
                ProductMenu productMenu = new ProduceProductMenu();
            }
//            UserInfoItem userInfoItem = new UserInfoItem(username, password, true);
//            Person person = new Seller(userInfoItem.name, userInfoItem.password);
//            personList.addi(person);
        }
        productScanner.close();

    }

}
