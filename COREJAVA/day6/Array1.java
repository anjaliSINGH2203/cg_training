//WAJP to enter an array and print it in reverse order

import java.util.*;

class Array1{

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);


System.out.println("enter the length");

int n= sc.nextInt();
int arr[]= new int[n];

System.out.println("enter the elrments");

for(int i =0; i<n;i++)
{
   arr[i]= sc.nextInt();
}


System.out.print("Array in reverse order is: ");

for(int i=n-1;i>=0;i--)
{
   System.out.print(arr[i] + " ");
}

}
}