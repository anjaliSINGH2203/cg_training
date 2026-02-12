//Write a program to rotate an array to the left and right.

import java.util.*;

public class RotateArray{


	public static int[] leftRotate(int arr[], int n)
	{
	 int first= arr[0];

		for(int i=0;i<n-1;i++)
		{
		arr[i]= arr[i+1];
		}
	arr[n-1]= first;
	
	return arr;
	}

//---------------------------------------------------------------------


	public static int[] rightRotate(int arr[], int n)
	{
	 int last= arr[n-1];

		for(int i=n-1;i>0;i--)
		{
		arr[i]= arr[i-1];
		}
	arr[0]= last;
	
	return arr;
	}

//-----------------------------------------------------------------------


	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the length of an array: ");
	int n= sc.nextInt();
	int arr[]= new int[n];

	System.out.println("enter the elements: ");
	
	for(int i=0;i<n;i++)
	{
	arr[i]= sc.nextInt();
	}

// Copy array for right rotation
        int arrCopy[] = arr.clone();

	int result1[]= leftRotate(arr,n);   //leftRotate() invoked 
	System.out.print("left rotated array is: ");
	for(int i=0;i<n;i++)
	System.out.print(result1[i]+ " ");


        int result2[]= rightRotate(arrCopy,n);   //rightRotate method invoked
	System.out.print("/nright rotated array is: ");
	for(int i=0;i<n;i++)
	System.out.print(result2[i]+ " ");

}
}