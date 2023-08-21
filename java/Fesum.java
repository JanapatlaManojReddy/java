class Fesum
{
	public static void main(String args[])
	{
		int m=100,sum=0;
		for(int i=1;i<=50;i++)
		{
			if(m%i==0)
			System.out.println(i);
				sum=sum+i;
		}
		System.out.println(sum);
	}
}