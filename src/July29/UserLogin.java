package July29;

public class UserLogin {
    private  String userName;
    private  String password;

    public UserLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void loginUser(String userName, String password){
        if(this.userName.equals(userName)&&(this.password.equals(password))){
            System.out.println("User authenticated");
            System.out.println("Welcome to My app");
        }
        else {
            System.out.println("Invalid entry");
            System.out.println("Try Again");
        }
    }
}
