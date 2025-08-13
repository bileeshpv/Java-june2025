package auguest5;

public class MainPayment {
    public static void main(String[] args) {
        Payment c= new CreditCardPayment();
        c.processPayment(12.3);
        c.validate();
        Payment d= new DebitCardPayment();
        d.processPayment(11.2);
        d.validate();
        Payment p= new PayPalPayment();
        p.processPayment(13.5);
        p.validate();
    }
}
