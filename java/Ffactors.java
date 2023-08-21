class Ffactor
{
	public static void main(String args[])
	{
		int i=1,n=2,even=0,odd=1,count=0;
		for(;i<=n;i++)
		{
			
			if(n%i==0)
			{
				count++;
				System.out.println(i+"is a factor of"+n);	
					if(i%2==0)
						even=even+i;
					else
						odd=odd*i;
            }
				
		
		}
				System.out.println("sum of the even factors= "+even);
				System.out.println("product of odd factors= "+odd);
				System.out.println("count of factors= "+count);
				if(count==2)
					System.out.println("its a right number");
				else 
					System.out.println("its a wrong number");
	}
}