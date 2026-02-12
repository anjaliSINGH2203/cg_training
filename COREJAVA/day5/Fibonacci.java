/*53. Write a program to print the first n numbers in the Fibonacci sequence.
	0, 1, 1, 2, 3, 5, 8, 13, ...
*/


import java.util.*;
class Fibonacci{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Entyer the value of n");
int n= sc.nextInt();

int a= 0, b= 1;
System.out.print(a +", " + b+ ", ");

while(n>0){
int c= a+b;
System.out.print(c+ ", ");
a=b;
b=c;

n--;
}

}
}



