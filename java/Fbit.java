import java.util.*;

class Fbit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int count=0,num2=num,x=1,rev=0,rem=0;
		for(;num>0;num/=10)
		{
			count++;
		}
		if(count%2==0)
		{
			num=num2;
			for(x=1;x<=count/2;x++)
			{
				rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			if(rev==num)
				System.out.println("its a bit number");
			else
				System.out.println("its not a bit number");
		}
		else
				System.out.println("its not a bit number");
	}
}
