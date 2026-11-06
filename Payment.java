
package electronicpaymentsystem;

import java.time.LocalDate;
public abstract class Payment {

    protected String paymentId;
    protected double amount;
    protected LocalDate paymentDate;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = LocalDate.now();
    }

    public abstract double calculateFee();

    public abstract String getPaymentMethod();

    public double calculateTotal() {
        return amount + calculateFee();
    }

    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Method: " + getPaymentMethod());
        System.out.println("Payment Fee: " + calculateFee());
        System.out.println("Total Amount: " + calculateTotal());
    }
}