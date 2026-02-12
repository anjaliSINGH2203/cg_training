package com.OnlineFoodOrderTracker;

public class OrderRecord {
	private int customerId;
	private String customerName;
	private Order order;
	public OrderRecord(int customerId, String customerName, Order order) {
		this.customerId= customerId;
		this.customerName= customerName;
		this.order= order;
	}
	
	 public int getCustomerId() {
	        return customerId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public Order getOrder() {
	        return order;
	    }
}
