//design a method to print whether the number is palindrome or not
import java.util.*;

class Palindrome{

public static String palin(int n)
{
  int temp=n;

while(n>0){
 
int i=1;

int rem= n%10;
int s= rem * Math.pow(i,10) ;
n= n/10;
}

if (temp==s){
return "Palindrome";
}
else{
return "not Palindrome"
}
}

public static void main(String args[])
{

Scanner sc= new Scenner(System.in);

System.out.println("enter a number");

int n= sc.nextInt();
}
