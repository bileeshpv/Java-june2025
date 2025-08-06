package Interface;

public class SmsNotifier implements Notifier{
    @Override
    public void notifyUser(String smsmessage) {
        System.out.println(smsmessage);

    }
}
