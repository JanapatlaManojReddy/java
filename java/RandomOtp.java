import java.util.*;
class RandomOtp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Random rm = new Random();
		int otp = rm.nextInt(num1,num2);
		System.out.println("your otp is " +otp);
	}
}
		