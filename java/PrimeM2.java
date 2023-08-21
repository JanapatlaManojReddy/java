import java.util.*;
class PrimeM2
{
	int num,c;
	public int callPrime()
	{
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
				{
					c++;
					break;
				}
		}
		return c;
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		PrimeM2 p = new PrimeM2();
		p.num=sc.nextInt();
		int output=p.callPrime();
		if(output==0)
			System.out.println("it is a prime");
		else
			System.out.println("it is not a prime");
	}
}

		
	
		