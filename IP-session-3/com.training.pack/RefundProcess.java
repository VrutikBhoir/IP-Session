package com.training.pack;

public class RefundProcess
{
	public void refundPayment(Payment payment, double amount, String customer)
	{
		if (payment == null)
		{
			System.out.println("Payment method is required");
		}
		else if (amount <= 0)
		{
			System.out.println("Refund amount should be greater than 0");
		}
		else if (!"Success".equals(payment.getstatus()))
		{
			System.out.println("Refund is available only for successful payments");
		}
		else if (!payment.checkLimit(amount))
		{
			System.out.println("Refund amount exceeds the payment limit");
		}
		else
		{
			payment.refund(amount, customer);
		}
	}
}
