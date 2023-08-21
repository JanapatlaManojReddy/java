import java.util.*;
class PalindromeM2
{
	int num,rev,rem,temp ;
	public int callPrime()
	{
		temp=num;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
	num=temp;	
	return rev;	
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		PalindromeM2 pa = new PalindromeM2(); 
		pa.num=sc.nextInt();
		int result = pa.callPrime();
		
		if(result==pa.num)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
}
	
	