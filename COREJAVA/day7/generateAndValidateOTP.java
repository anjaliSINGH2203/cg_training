// Design a programs to generate ansd validate otp

import java.util.*;

public class generateAndValidateOTP{

public static int generateOTP()
{
	return 1000+new Random().nextInt(9000);  // ensures 4 digit otp
{


public  static bool validateOTP(int userInput, int generateOTP )
{
	
	return generateOTP==userInput;
} 

public static void main( String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("enter the otp: ");
int userOtp= sc.nextInt();
int otp= generateOTP();

System.out.println(validateOTP(userOtp, otp) ? "OTP entered is correct" : "OTP entered is not correct");
}
}