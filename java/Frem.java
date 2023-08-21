class Frem
{
	public static void main(String args[])
	{
		int n=1276,rem=0,g=0,sum=0,temp=0;
		for(;n>0;n/=10)
		{
			temp++;
			rem=n%10;
			System.out.println(rem);
			sum=sum+rem;
			if(rem>g)
				g=rem;
		}
		System.out.println(temp);
		
		System.out.println(sum);
		System.out.println(g);
	}
}
		