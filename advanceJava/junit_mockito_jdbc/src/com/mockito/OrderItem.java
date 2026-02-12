package com.mockito;

public class OrderItem {
	private PaymentGateway pg;//dependency
	
	//Constructor Injection
	public OrderItem(PaymentGateway pg) {
		this.pg=pg;
	}
	
	public String placeOrderItem(double amount) {
		boolean status= pg.processPayment(amount);
		
		if(status) {
			return "Order Placed Successfully";
		}
		return "Payment Failed. Order cancelled";
	}

}
