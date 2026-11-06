
package electronicpaymentsystem;

public class BankTransfer extends Payment implements Payable {

    private String bankName;

    public BankTransfer(String paymentId, double amount, String bankName) {
        super(paymentId, amount);
        this.bankName = bankName;
    }

    @Override
    public double calculateFee() {
        return amount * 0.01;
    }

    @Override
    public String getPaymentMethod() {
        return "Bank Transfer";
    }

    @Override
    public void processPayment() {
        System.out.println("Bank Transfer Processed Successfully");
    }
}
