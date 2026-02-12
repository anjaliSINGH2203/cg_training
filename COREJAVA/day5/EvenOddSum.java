//WAJP to find product of even digit sum and odd digit sum.




import java.util.*;
class EvenOddSum{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of n");
int n= sc.nextInt();
int evenSum=0, oddSum=0;
while(n>0)
{
int rem= n%10;
if(rem%2==0){
evenSum+=rem;  // sums up even digit in number
}
else{
oddSum+=rem;  // summation of odd digits in n
}
n/=10;
}
System.out.println("Even Digit Sum = "+ evenSum);
System.out.println("Odd Digit Sum = "+ oddSum);
System.out.println("Product of Even Digit Sum and odd DigitSum= "+ evenSum*oddSum);

}
}


