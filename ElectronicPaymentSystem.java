
package electronicpaymentsystem;

public class ElectronicPaymentSystem {

    public static void main(String[] args) {
       Payment payment1 = new CreditCardPayment(
                "PAY101", 1000, "123456789");

        Payment payment2 = new BankTransfer(
                "PAY102", 2000, "National Bank");

        Payment[] payments = {payment1, payment2};

        PaymentReceipt receipt = new PaymentReceipt();

        for (Payment payment : payments) {

            if (payment instanceof Payable) {
                ((Payable) payment).processPayment();
            }

            receipt.printReceipt(payment);
        }
    }
    }
    

