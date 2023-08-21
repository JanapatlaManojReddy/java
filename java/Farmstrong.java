import java.util.*;

class Farmstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int temp=n,count=0,sum=0,rem=0;
		for(;n>0;n/=10)
		{
			count++;
		}
		n=temp;
		for(;n>0;n/=10)
		{
			rem=n%10;
			rem=(int)(Math.pow(rem,count));
			sum=sum+rem;
		}
		
		if(temp==sum)
			System.out.println("its a armstrong number");
		else 
			System.out.println("its not a armstrong number");
	}
}
		

			
			