//WAP to check the given number is even or odd but give a proper printing statement

import java.util.Scanner;

class EvenOdd{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number");
int a= sc.nextInt();

String res=  a%2==0 ? "even" : "odd";  // logic to check the number is even or not and store it in the string variable
System.out.println("The given number is "+ res);
}
}