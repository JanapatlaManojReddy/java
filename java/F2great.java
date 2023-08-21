class F2great
{
	public static void main(String args[])
	{
		int num=579843,rem=0, temp=num, count=0,count2=0;
		for(;num>0;num/=10)
		{
			rem=num%10;
			if(rem>count)
				count=rem;
		}
		num=temp;
		for(;num>0;num/=10)
		{	
			rem=num%10;
			if(count==rem)
				count=rem;	
			else if(rem>count2)
				count2=rem;
		}
			System.out.println("second largest number "+count2);
		
			System.out.println("largest number "+count);
	}
} 