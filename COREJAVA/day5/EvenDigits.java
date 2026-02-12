//WAJP to print even digit of a given number.

//WAJP to print digit of a given number.


import java.util.*;
class EvenDigits{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n");
int n= sc.nextInt();

while(n>0)
{
int rem= n%10;
if(rem%2==0){
System.out.print(rem + " ");
}
n/=10;
}

}
}


