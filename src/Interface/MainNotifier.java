package Interface;

public class MainNotifier {
    public static void main(String[] args) {
        String email="email sent";
        String sms="SMS sent";
        String push="Push message Sent";
        Notifier notifier=new EmailNotifier();
        notifier.notifyUser(email);
        Notifier s=new SmsNotifier();
        s.notifyUser(sms);
        Notifier p=new PushNotifier();
        p.notifyUser(push);


    }
}
