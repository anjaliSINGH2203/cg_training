//WAJP to print prime digit of a given number.





import java.util.*;
class PrimeDigits{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n");
int n= sc.nextInt();

while(n>0)
{
int rem= n%10; // finds single digit from the last of the number
int count=0;

for(int i=2;i<=rem/2;i++){ 

if(rem%i==0){  // to check if digit is divisible by the numbers in any range
count++;
break;
}
}
if( rem >1 && count==0){   // digit should not be 1 
System.out.print(rem + " ");
}
n/=10;
}

}
}


