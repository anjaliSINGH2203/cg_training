import java.util.*;
class MaxOf5{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 5 numbers");
int a= sc.nextInt(), b= sc.nextInt(), c= sc.nextInt(), d= sc.nextInt(), e= sc.nextInt();

System.out.println(a>b && a>c && a>d && a>e ? a : b>c && b>d && b>e ? b: c>d && c>e ? c : d>e ? d : e  +" is greatest");

}
}
