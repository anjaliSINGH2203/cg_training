//check whether the given number is positive or negative using if else


import java.util.*;

class PositiveIfElse{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("enter a number");

int n= sc.nextInt();
String res;

if(n>0){
res= "Positive";
}else{
res= "Negative";

}
System.out.println("the given number "+n+" is "+ res);

}
}