//WAJP to print digit of a given number.


import java.util.*;
class PrintDigits{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n");
int n= sc.nextInt();

while(n>0)
{
int rem= n%10;
System.out.print(rem + " ");
n/=10;
}

}
}


