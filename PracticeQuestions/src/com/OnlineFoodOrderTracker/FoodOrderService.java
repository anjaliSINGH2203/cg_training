package com.OnlineFoodOrderTracker;
import java.util.*;

public class FoodOrderService {
	Queue<OrderRecord> orderQueue = new LinkedList<>();//(to process FIFO)
	TreeMap<Integer, Customer> customerMap = new TreeMap<>();//(to store customers sorted by ID)
	
	boolean placeOrder(int customerId, String customerName, Order order) {
		//create customer of not present
		Customer customer= customerMap.get(customerId);
		if(customer==null) {
			customer= new Customer(customerId, customerName);
			customerMap.put(customerId, customer);
		}
		//max 5 orders per customer
		if(customer.getOrders().size()>=5) {
			return false;
		}
		//ad order to customer
		customer.getOrders().add(order);
		orderQueue.add(new OrderRecord(customerId, customerName, order));
		return true;
	}
	

}
