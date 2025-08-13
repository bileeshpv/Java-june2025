package auguest5;

public class CreditCardPayment extends Payment{
    @Override
    public void validate() {
        System.out.println("Payment Validate for Credit Card");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("processed amount is "+ amount);

    }
}
