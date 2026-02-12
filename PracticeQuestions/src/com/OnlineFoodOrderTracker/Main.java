package com.OnlineFoodOrderTracker;

public class Main {
	public static void main(String args[]) {
		FoodOrderService service = new FoodOrderService();

		System.out.println(service.placeOrder(1, "Anjali", new Order(101, "Laptop",20)));
		System.out.println(service.placeOrder(1, "Anjali", new Order(102, "Mouse",30)));
		System.out.println(service.placeOrder(1, "Anjali", new Order(103, "Keyboard",40)));
		System.out.println(service.placeOrder(1, "Anjali", new Order(104, "Monitor",50)));
		System.out.println(service.placeOrder(1, "Anjali", new Order(105, "USB",60)));
		System.out.println(service.placeOrder(1, "Anjali", new Order(106, "Charger",70))); // false
		
		String regex= "[A-Z]{2,}[a-z]{2,}[0-9]{2,}[@$#]{1,}"
				String s= "abAB@12"

	}

}
