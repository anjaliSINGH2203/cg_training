//Design a simple calculator using if else if

import java.util.*;

class Calculator{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers you want to perform operation on");
	int first_num= sc.nextInt();
	int second_num= sc.nextInt();
	System.out.println("Enter what operation you want to perform i.e +, -, *, /, %");
	char c= sc.next().charAt(0);
	
	if(c=='+')
	{
	System.out.println(first_num+ " + "+second_num + " = " + (first_num +second_num));
	}
	else if(c=='-')
	{
	System.out.println(first_num +" - "+second_num + " = " + (first_num -second_num));
	}
	else if(c=='*')
	{
	System.out.println(first_num+ " * "+second_num + " = " + (first_num *second_num));
	}
	else if(c=='/')
	{
	System.out.println(first_num +" / "+second_num + " = " + (first_num /second_num));
	}
	else
	{
	System.out.println(first_num+ " % "+second_num + " = " + (first_num %second_num));
	}



}
}