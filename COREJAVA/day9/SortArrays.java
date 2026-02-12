// write a method to srt an array in ascending order

import java.util.*;

public class SortArrays{

public static int[] sortAsc(int[] arr, int n){
	for(int i=0;i<n;i++)
	{
	for(int j=i+1;j<n;j++){
		if(arr[i]> arr[j])
		{
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]= temp;	
		}
	}
	}
return arr;

}


public static void  main(String args[])
{

	Scanner sc= new Scanner(System.in);
	System.out.print("enter the range : ");
	int n= sc.nextInt();

	int arr[]= new int[n];

	System.out.println("\nenter the values:");
	for(int i=0;i<n;i++){
	arr[i]= sc.nextInt();

	}
	System.out.print("the sorted array is: "); 

	sortAsc(arr, n);
	
	for(int i=0;i<n;i++)
	{
	System.out.print(arr[i]+ ", ");
	}
	 
}
}