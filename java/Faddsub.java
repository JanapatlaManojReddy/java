class Faddsub
{
	public static void main(String args[])
	{
		int n= 11211,rem=0,count=0,add=0,mul=1;
		for(;n>0;n/=10)
		{
			rem=n%10;
			if(count==0||count==4)
					add=add+rem;
			else
					mul=mul*rem;
		count++;
		}
	int result = mul>add?mul-add:add-mul;
	System.out.println(result);
	}
}
		
			
			