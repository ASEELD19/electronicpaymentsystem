
package electronicpaymentsystem;

public class CreditCardPayment  extends Payment implements Payable {

    private String cardNumber;

    public CreditCardPayment(String paymentId, double amount, String cardNumber) {
        super(paymentId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calculateFee() {
        return amount * 0.025;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }

    @Override
    public void processPayment() {
        System.out.println("Credit Card Payment Processed Successfully");
    }
}
    

