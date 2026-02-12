package com.OnlineFoodOrderTracker;
import java.util.*;

public class Customer {
	private int customerId;
	private String customerName;
	List<Order> orderList= new ArrayList<>();
	Customer(int customerId, String customerName){
		this.customerId= customerId;
		this.customerName= customerName;
		}
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	

    public List<Order> getOrders() {
        return orderList;
    }
	
	

}
