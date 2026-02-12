// take three prod and their price from the user and sum it up. if the total price is 10000 above then give 20 % discount and give the final amt. to pay

import java.util.*;
class Discount{
public static void main(String args[]){

Scanner sc= new Scanner(System.in);

System.out.println("Enter three products and their price");

String prod1, prod2, prod3;
double price1, price2, price3;

prod1= sc.next();
price1= sc.nextDouble(); 

prod2= sc.next();
price2= sc.nextDouble(); 

prod3= sc.next();
price3= sc.nextDouble(); 

double sum= price1+ price2+ price3;  // calculating total price
double discountedPrice;
double finalPrice;

if(sum>=10000)
{
System.out.println("Congratulations! You have unlocked a 20% discount");

 discountedPrice= 10000*0.20; // calculating total discount
 finalPrice= sum - discountedPrice; // calculating total price after giving discounts

System.out.println("Total Price = "+ sum);
System.out.println("Total Discount = "+ discountedPrice);
System.out.println("Final Price = "+ finalPrice);
}

}
}
