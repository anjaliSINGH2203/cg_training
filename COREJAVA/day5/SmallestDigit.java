//WAJP to find smallest digit.






import java.util.*;
class SmallestDigit{
public static void main(String args[]){

Scanner sc= new Scanner(System.in);

System.out.println("Enter the value of n");
int n= sc.nextInt();
int min= Integer.MAX_VALUE;


while(n>0)
{
int rem= n%10;

if(min > rem){
min= rem;

}


n/=10;
}
System.out.println("Smallest Digit= "+ min);

}
}


