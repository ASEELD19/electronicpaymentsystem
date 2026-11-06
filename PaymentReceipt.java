/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicpaymentsystem;

/**
 *
 * @author HP
 */
public class PaymentReceipt {
    public void printReceipt(Payment payment) {

        System.out.println("\n========== PAYMENT RECEIPT ==========");

        payment.displayPayment();

        System.out.println("=====================================");
    }
}
