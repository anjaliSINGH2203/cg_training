//Write a program to find second largest element in an array.


import java.util.*;

class SecondLarge{


public static int secondLargest( int arr[], int n){

int largest= Integer.MIN_VALUE;
int second_largest= Integer.MIN_VALUE;

for(int i=0;i<n;i++){
	if(arr[i]> largest)
	{
	second_largest= largest;
	largest=arr[i];

	}
	else if(arr[i]> second_largest && largest!= arr[i])
	{
	second_largest= arr[i];
	}


}
return second_largest;

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

System.out.println("Second largest element is: " + secondLargest(arr, n));

}
}
