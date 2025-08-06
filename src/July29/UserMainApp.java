package July29;

public class UserMainApp {
    public static void main(String[] args) {
        UserLogin userLogin=new UserLogin("pragra","pragra123");
        userLogin.loginUser("pragra","pragra123");
        System.out.println(userLogin.getUserName());
        userLogin.setPassword("mypassword");
        userLogin.loginUser("pragra","pragra123");


    }
}
