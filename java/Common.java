class Common
{
	public static void main(String args[])
	{
		int a=9,b=20,i=1,c=0;
			while(i<=a&&i<=b)
			{
				if(a%i==0&&b%i==0)
				{
				c=i;
				}
			i++;
			}
		System.out.println(c);
	}
}
				
			