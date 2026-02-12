/* Problem Requirements
	input1 represents the current hour position on a clock (1–12).
	input2 represents the number of jumps/multiplication factor.
	Multiply input1 and input2 to calculate the movement.
	The clock should always stay within 1 to 12.
	If the calculated value exceeds 12, it should wrap around using clock logic.
	If the final calculated position becomes 0, it must be treated as 12.
	Test case 1 : 
	input1 = 3
	input2 = 4
	
	output is  12.
	Test case 2 : 
	input1 = 4
	input2 = 5
	
	output is 8.
	
	Test case 3:
	input1 = 9
	input2 = 7
	
	output is 3.
*/


import java.util.*;
class Clock{

public void calculate(int input1, int input2)
{
int mul= input1* input2;

while(mul>12){
mul-=12;

}
System.out.println(mul);
}

public static void main(String args[]){
Scanner sc= new Scanner(System.in);

System.out.println("enter ckock hour:");
int clock_hour= sc.nextInt();

System.out.println("enter multiplication factor");
int mul_factor=sc.nextInt();

Clock c= new Clock();
c.calculate(clock_hour, mul_factor);

}
}












