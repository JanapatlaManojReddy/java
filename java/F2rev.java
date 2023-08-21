class F2rev
{
	public static void main(String args[])
	{
		int n = 305700,rev=0,rem=0,temp=n,temp2=0,c1=0,c2=0,d=0,org=0,x=1;
		for(;n>0;n/=10)
		{
			rem=n%10;
			rev=rev*10+rem;
			c1++;
	
		}
			temp2=rev;
		for(;rev>0;rev/=10)
		{
			rem=rev%10;
			org=org*10+rem;
			c2++;
		}
	
	
	   d=c1-c2;
   int result = (int)(org*Math.pow(10,d));
		for(x=1;x<=d;x++)
		{
			org=org*10;
		}
	System.out.println(temp);
	System.out.println(temp2);
	System.out.println(org);
	}
}		
	   
		
			