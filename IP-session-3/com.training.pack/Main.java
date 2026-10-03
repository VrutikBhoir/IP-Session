package com.training.pack;
public class Main {
    public static void main(String args[]) {
        Payment payment = new CreditCardPayment();
        Payment upiPayment = new UPI();
        RefundProcess refundProcess = new RefundProcess();

        payment.setstatus("Success");
        upiPayment.setstatus("Success");

        double creditCardAmount = 2309;
        if (payment.checkTransaction(creditCardAmount)
                && payment.checkLimit(creditCardAmount)) {
            payment.pay(creditCardAmount, "Manish");
            refundProcess.refundPayment(payment, creditCardAmount, "Manish");
        }

        double upiAmount = 100;
        if (upiPayment.checkTransaction(upiAmount)
                && upiPayment.checkLimit(upiAmount)) {
            upiPayment.pay(upiAmount, "Ajay");
            refundProcess.refundPayment(upiPayment, upiAmount, "Ajay");
        }
    }
}
