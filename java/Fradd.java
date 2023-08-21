class Fradd
{	
	public static void main(String args[])
	{
		int n=13946,rem=0,add=0;
		for(;n>0;n/=10)
		{
			rem=n%10;
			if(rem%2==0)
				rem=rem/2;
			      
			else 
				rem=rem*2;
		add=add+rem;
		}
		System.out.println(add);
	}
}