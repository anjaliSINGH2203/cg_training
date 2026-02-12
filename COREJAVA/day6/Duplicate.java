//Write a program to find the duplicate number in an array

import java.util.*;

class Duplicate{


public static void findDuplicate( int arr[], int n){

for(int i=0;i<n;i++)
{
for(int j= i+1; j<n;j++)
{
 if(arr[j] == arr[i]){
 
	System.out.println("duplicate found: "+ arr[j]);
	break;
 }

}

}
}


public static void main(String args[]){

Scanner sc= new Scanner(System.in);

System.out.println("enter the length of array: ");
int n= sc.nextInt();

int arr[] = new int[n];

System.out.println("enter the elements:");

for(int i=0;i<n;i++)
{
	arr[i]= sc.nextInt();
}

findDuplicate(arr, n);

}
}
