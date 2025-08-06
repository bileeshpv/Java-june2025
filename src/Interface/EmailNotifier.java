package Interface;

public class EmailNotifier implements Notifier {
    @Override
    public void notifyUser(String message) {
        System.out.println(message);
    }
}
