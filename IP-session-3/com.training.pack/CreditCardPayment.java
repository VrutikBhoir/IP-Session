package com.training.pack;
class CreditCardPayment extends Payment
{
    public void validatecard()
    {
        System.out.println("Validating Your Card......");
    }

    @Override
    public void refund(double amount, String cust)
    {
        System.out.println("Refunding Payment of " + amount + "....for " + cust + " through Credit Card");
    }

    @Override
    public boolean checkTransaction(double amount)
    {
        boolean valid = amount > 0;
        System.out.println("Credit card transaction check: " + (valid ? "Success" : "Failed"));
        return valid;
    }

    @Override
    public boolean checkLimit(double amount)
    {
        boolean withinLimit = amount <= 50000;
        System.out.println("Credit card limit check: " + (withinLimit ? "Within limit" : "Limit exceeded"));
        return withinLimit;
    }
}