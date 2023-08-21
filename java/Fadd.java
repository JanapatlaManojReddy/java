class Fadd
{
	public static void main(String args[])
	{
		int n =6721,rem=0,even=0,odd=0,rev=0;
		for(;n>0;n/=10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		
		for(;rev>0;rev/=10)
		{
			
			rem=rev%10;
		    
			if(rem%2==0)
			{
				even=rem+2;
				System.out.print(even);
			}
			else
			{
				odd=rem+1;
				System.out.print(odd);
			}
		
		}
		
	}
}