package Interface;

public class PushNotifier implements Notifier{
    @Override
    public void notifyUser(String pushmessage) {
        System.out.println(pushmessage);

    }
}
