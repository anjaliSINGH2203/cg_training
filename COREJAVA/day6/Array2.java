//find max element in array

import java.util.*;

class Array2{

public static void evenOddCount(int arr[])
{
int n= arr.length;


int evenCount=0, oddCount=0;

for(int i=0;i<n;i++)
{
 if( arr[i]%2==0){
  evenCount+= arr[i];
}
else{
oddCount+= arr[i];
}
}
System.out.println("the sum of even numbers is "+ evenCount + " and sum of odd numbers is "+oddCount);



}

//-----------------------------------------------------------------------------------------------------

public static int findMax(int arr[])
{
int n= arr.length;
int max= Integer.MIN_VALUE;

for(int i=0;i<n;i++)
{
 if(max< arr[i]){
  max= arr[i];
}
}
return max;

}

//-----------------------------------------------------------------------------------------

public static int findAvg(int arr[])
{
int n= arr.length;
int max= Integer.MIN_VALUE;
int sum=0;
for(int i=0;i<n;i++)
{
 sum+= arr[i];

}
int avg= sum/n;
return avg;

}

//-------------------------------------------------------------------------------------------------


public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

System.out.println("enter the size of array: ");

int n= sc.nextInt();

int arr[]= new int[n];

System.out.println("enter the values: ");

for(int i=0;i<n;i++)
{
arr[i]= sc.nextInt();
}

System.out.println("the max element in array is: " + findMax(arr));

System.out.println("the avg of elements in array is: " + findAvg(arr));
evenOddCount(arr);





}
}