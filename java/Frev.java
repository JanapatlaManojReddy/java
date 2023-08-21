class Frev
{
	public static void main(String args[])
	{
		int n =57800,rem=0,eve=0,rev=0,count=0,org=0;
        for(;n>0;n/=10)
		{
			rem=n%10;
			rev=rev*10+rem;
			
			if(rem==0)
				count++;
		}
		System.out.println(rev);
	

		
		for(;rev>0;rev/=10)
		{
			rem=rev%10;
			org=org*10+rem;
			
		}
		eve=(int)(org*Math.pow(10,count));
		System.out.println(eve); 
		
	}
} 