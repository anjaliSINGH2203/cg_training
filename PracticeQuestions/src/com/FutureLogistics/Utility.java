package com.FutureLogistics;

//Utility class for validation and object creation
public class Utility {

 // Validate transport ID
 public boolean validateTransportId(String transportId) {
     if (transportId.matches("RTS\\d{3}[A-Z]")) {
         return true;
     }
     System.out.println("Transport id " + transportId + " is invalid");
     System.out.println("Please provide a valid record");
     return false;
 }

 // Parse input string and return GoodsTransport object
 public GoodsTransport parseDetails(String input) {

     String[] data = input.split(":");

     String transportId = data[0];
     String transportDate = data[1];
     int transportRating = Integer.parseInt(data[2]);
     String transportType = data[3];

     if (!validateTransportId(transportId)) {
         return null;
     }

     if (transportType.equalsIgnoreCase("BrickTransport")) {
         return new BrickTransport(
                 transportId,
                 transportDate,
                 transportRating,
                 Float.parseFloat(data[4]),
                 Integer.parseInt(data[5]),
                 Float.parseFloat(data[6])
         );
     } else {
         return new TimberTransport(
                 transportId,
                 transportDate,
                 transportRating,
                 Float.parseFloat(data[4]),
                 Float.parseFloat(data[5]),
                 data[6],
                 Float.parseFloat(data[7])
         );
     }
 }

 // Identify object type
 public String findObjectType(GoodsTransport goodsTransport) {
     if (goodsTransport instanceof TimberTransport) {
         return "TimberTransport";
     }
     return "BrickTransport";
 }
}
