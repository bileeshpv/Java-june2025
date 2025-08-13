package auguest5;

public class PayPalPayment extends Payment{

    @Override
    public void validate() {
        System.out.println("Payment Validate for Paypal");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("processed amount is "+ amount);

    }
}
