package auguest5;

public class DebitCardPayment extends Payment {
    @Override
    public void validate() {
        System.out.println("Payment Validate for Debit Card");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("processed amount is "+ amount);
    }
}
