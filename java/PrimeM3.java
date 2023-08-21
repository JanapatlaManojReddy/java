import java.util.*;
class PrimeM3
{
	public static  void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int t = sc.nextInt();
		User p = new User();
		for(int i = f;i<=t;i++)
		{
		
		int m = p.cPrime(i);
		if(m==0)
			System.out.println(i);
		}
	}
}
		




class User
{
       int fact;
	public int cPrime(int n)	
	{
           fact=0;
		
		for(int j = 2;j<=n/2;j++)
		{
			if(n%j==0)
			{
				fact++;
				break;
			}
		}
		return fact;
	}
}
