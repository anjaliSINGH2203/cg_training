//design methods to print Armstrong number



import java.util.*;
public class Armstrong{

public static int length(int n) // function to count the number of digits in a number
{
int count=0;
while(n!=0)
{
count++;
n=n/10;
}
return count;
}

//-------------------------------------------------------------------------------------------------------------------

public static int power(int base, int exp){ //  function for calculation of power

int result=1;
for(int i=1;i<=exp;i++)
{
result= result*base;
}
return result;

}
//-------------------------------------------------------------------------------------------------------------------


public static Boolean armstrongCheck(int num)   // to check the number is Armstrong or not
{
int temp = num;
int sum=0;
int l= length(num);

while(num>0)
{
int rem= num%10;
sum+= power(rem, l);              // using user defined function for calculating power instead of inbuilt math class fn 
num/=10;
}

return sum==temp;
}

//--------------------------------------------------------------------------------------------------------------------

public static void main(String args[])
{

Scanner sc= new Scanner(System.in); 
System.out.println("eneter a number: ");

int n= sc.nextInt();


Boolean b= armstrongCheck(n);
System.out.println(b ? "Armstrong number" : "not an Armstrong number");


}
}