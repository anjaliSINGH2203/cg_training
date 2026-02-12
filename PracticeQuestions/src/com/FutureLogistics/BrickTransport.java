package com.FutureLogistics;

//Child class for Brick transport
public class BrickTransport extends GoodsTransport {

 // Private attributes as per requirement
 private float brickSize;
 private int brickQuantity;
 private float brickPrice;

 // Public 6-argument constructor
 public BrickTransport(String transportId, String transportDate, int transportRating,
                       float brickSize, int brickQuantity, float brickPrice) {
     super(transportId, transportDate, transportRating);
     this.brickSize = brickSize;
     this.brickQuantity = brickQuantity;
     this.brickPrice = brickPrice;
 }

 // Getter and Setter methods
 public float getBrickSize() {
     return brickSize;
 }

 public void setBrickSize(float brickSize) {
     this.brickSize = brickSize;
 }

 public int getBrickQuantity() {
     return brickQuantity;
 }

 public void setBrickQuantity(int brickQuantity) {
     this.brickQuantity = brickQuantity;
 }

 public float getBrickPrice() {
     return brickPrice;
 }

 public void setBrickPrice(float brickPrice) {
     this.brickPrice = brickPrice;
 }

 // Vehicle selection based on brick quantity
 @Override
 public String vehicleSelection() {
     if (brickQuantity < 300) {
         return "Truck";
     } else if (brickQuantity <= 500) {
         return "Lorry";
     } else {
         return "MonsterLorry";
     }
 }

 // Total charge calculation for BrickTransport
 @Override
 public float calculateTotalCharge() {
     float price = brickPrice * brickQuantity;
     float tax = price * 0.3f;

     // Discount based on transport rating
     float discount = 0;
     if (transportRating == 5) {
         discount = price * 0.20f;
     } else if (transportRating == 3 || transportRating == 4) {
         discount = price * 0.10f;
     }

     // Vehicle price
     float vehiclePrice;
     String vehicle = vehicleSelection().toLowerCase();

     if (vehicle.equals("truck")) {
         vehiclePrice = 1000;
     } else if (vehicle.equals("lorry")) {
         vehiclePrice = 1700;
     } else {
         vehiclePrice = 3000;
     }

     return (price + tax + vehiclePrice) - discount;
 }
}
