package com.training.pack;
public class UPI extends Payment
{
    @Override
    public void pay(double amount, String cust)
    {
        setPaymentDetails(amount, cust);
        System.out.println("Processing Payment of " + amount + "....for " + cust + " with UPI");
    }

    @Override
    public void refund(double amount, String cust)
    {
        System.out.println("Refunding Payment of " + amount + "....for " + cust + " through UPI");
    }

    @Override
    public boolean checkTransaction(double amount)
    {
        boolean valid = amount > 0;
        System.out.println("UPI transaction check: " + (valid ? "Success" : "Failed"));
        return valid;
    }

    @Override
    public boolean checkLimit(double amount)
    {
        boolean withinLimit = amount <= 100000;
        System.out.println("UPI limit check: " + (withinLimit ? "Within limit" : "Limit exceeded"));
        return withinLimit;
    }
}
