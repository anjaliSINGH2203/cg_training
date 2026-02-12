import java.util.*;

class Sort{

public static int[] ascendingOrder(int arr[])
{
int min= Integer.MAX_VALUES;
int n= arr.length;

for(int i=0;i<n-1;i++){
  if(arr[i] < arr[i+1])
{
 temp= arr[i];
arr[i] = arr[i+1];
arr[i+1]= temp;
}


}
return arr;

}

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

ascendingOrder(arr);

for(int i=0;i<n;i++){
System.out.println(arr[i]+ " ");
}



}
}