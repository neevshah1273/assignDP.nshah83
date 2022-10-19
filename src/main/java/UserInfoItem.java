public class UserInfoItem {

    public String name;

    public String password;

    public boolean userType;

    public UserInfoItem(String username, String passWord, boolean b) {
        System.out.println(username+" "+passWord+" "+b);
        this.name=username;
        this.password=passWord;
        this.userType = b;
    }

    public UserInfoItem UserInfoItem(String username, String passWord, boolean b) {

        return new UserInfoItem(username, passWord, b);
    }
}
