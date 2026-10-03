package com.training.pack;
public abstract class Payment{

    private double amount;
    private String custname;
    private String status;
    // public void pay(double amount) {
    //     System.out.println("Processing Payament Of Amount......"+amount+".......");
    // }
    // public void pay(double amount, String cust)
    // {
    //     this.amount=amount;
    //     System.out.println("Processing Payment of " + amount + "....for " + cust);
    // }
    public double getAmm()
    {
        return amount;
    }
    public void setAmm(double amount)
    {
        if(amount>0)
        {
            this.amount=amount;
        }
        else
        {
            System.out.println("Amount should be greater than 0");
        }
    }
    public void pay(double amount, String cust)
    {
        if ("Success".equals(status))
        {
            System.out.println("Payment already done for " + cust);
        }
        else if ("Failed".equals(status))
        {
            System.out.println("Payment failed for " + cust);
        }
        else
        {
            System.out.println("Invalid status for " + cust);
        }
        System.out.println("Processing Payment of " + amount + "....for " + cust);
    }
    public abstract void refund(double amount, String cust);
    public abstract boolean checkTransaction(double amount);
    public abstract boolean checkLimit(double amount);

    protected void setPaymentDetails(double amount, String cust)
    {
        this.amount = amount;
        this.custname = cust;
    }
    public void setcustname(String custname)
    {
        this.custname=custname;
    }

    public String getcustname()
    {
        return custname;
    }

    public void setstatus(String status)
    {
        if("Success".equals(status) || "Failed".equals(status))
        {
            this.status=status;
        }
        else
        {
            this.status="Invalid";
            System.out.println("Invalid Saatus Code");
        }
    }

    public String getstatus()
    {
        return status;
    }
}