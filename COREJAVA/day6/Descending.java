//Write a program to sort an array in descending order.

import java.util.*;
class Descending{


public static void findDuplicates(int[] arr) {
    boolean found = false;

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }
    }

    if (!found) {
        System.out.println("No duplicate elements");
    }else{
      System.out.println("duplicate elements found");
}
    
}

//---------------------------------------------------------------------------------------
public static int[] desc(int arr[], int n){
int temp;
for(int i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){

if(arr[j]<arr[j+1]){
temp= arr[j];
arr[j]= arr[j+1];
arr[j+1]= temp;

}

}
}
return arr;
}

//--------------------------------------------------------------------------------------------------


public static int[] removeDuplicates(int[] arr, int n) {
int temp[]= new int[n];
int k=0;
 

for(int i=0;i<n;i++)
{
boolean isDuplicate= false;

for(int j=0;j<k;j++){
	if(temp[j]==arr[i]){
	isDuplicate= true;
	}

}



	if(!isDuplicate){
		temp[k++]= arr[i];
	}

}
 // Copy only unique elements
    int result[] = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = temp[i];
    }

    return result;
}




//---------------------------------------------------------------------------------------------------

public static void main(String args[]){

Scanner sc= new Scanner(System.in);
System.out.println("enter the length of array:");

int n= sc.nextInt();
int arr[]= new int[n];

System.out.println("enter the values:");

for(int i =0;i<n;i++)
{
arr[i]= sc.nextInt();
}
desc(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
System.out.println();

findDuplicates(arr);
System.out.println();


int[] uniqueArray = removeDuplicates(arr, n);

System.out.println("\narray after removing duplicates:");
for (int i = 0; i < uniqueArray.length; i++) {
    System.out.print(uniqueArray[i] + " ");
}



}
}


