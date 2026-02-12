//Write a program to find second smallest element in an array.


import java.util.*;

class SecondSmall{


public static int secondSmallest( int arr[], int n){

int smallest= Integer.MAX_VALUE;
int second_smallest= Integer.MAX_VALUE;

for(int i=0;i<n;i++){
	if(arr[i]< smallest)
	{
	second_smallest= smallest;
	smallest=arr[i];

	}
	else if(arr[i] < second_smallest && smallest!= arr[i])  // when array is in unsorted order in some cases
	{
	second_smallest= arr[i];
	}


}
return second_smallest;

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

System.out.println("Second largest element is: " + secondSmallest(arr, n));

}
}
