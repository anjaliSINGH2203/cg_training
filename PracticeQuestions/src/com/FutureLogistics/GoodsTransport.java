package com.FutureLogistics;

//Abstract parent class representing common transport details
public abstract class GoodsTransport {

 // Protected attributes as per requirement
 protected String transportId;
 protected String transportDate;
 protected int transportRating;

 // Public 3-argument constructor
 public GoodsTransport(String transportId, String transportDate, int transportRating) {
     this.transportId = transportId;
     this.transportDate = transportDate;
     this.transportRating = transportRating;
 }

 // Getter and Setter methods
 public String getTransportId() {
     return transportId;
 }

 public void setTransportId(String transportId) {
     this.transportId = transportId;
 }

 public String getTransportDate() {
     return transportDate;
 }

 public void setTransportDate(String transportDate) {
     this.transportDate = transportDate;
 }

 public int getTransportRating() {
     return transportRating;
 }

 public void setTransportRating(int transportRating) {
     this.transportRating = transportRating;
 }

 // Abstract methods
 public abstract String vehicleSelection();

 public abstract float calculateTotalCharge();
}

