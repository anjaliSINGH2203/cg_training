package com.FutureLogistics;

import java.util.Scanner;

//Main class to run the application
public class UserInterface {

 public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     Utility utility = new Utility();

     System.out.println("Enter the Goods Transport details");
     String input = scanner.nextLine();

     GoodsTransport goodsTransport = utility.parseDetails(input);

     if (goodsTransport == null) {
         return;
     }

     String type = utility.findObjectType(goodsTransport);

     System.out.println("Transporter id : " + goodsTransport.getTransportId());
     System.out.println("Date of transport : " + goodsTransport.getTransportDate());
     System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());

     if (type.equals("BrickTransport")) {
         BrickTransport bt = (BrickTransport) goodsTransport;
         System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
         System.out.println("Brick price : " + bt.getBrickPrice());
     } else {
         TimberTransport tt = (TimberTransport) goodsTransport;
         System.out.println("Type of the timber : " + tt.getTimberType());
         System.out.println("Timber price per kilo : " + tt.getTimberPrice());
     }

     System.out.println("Vehicle for transport : " + goodsTransport.vehicleSelection());
     System.out.println("Total charge : " + goodsTransport.calculateTotalCharge());
 }
}
