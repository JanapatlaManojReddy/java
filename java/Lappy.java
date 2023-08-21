class Lappy
{
	public static void main(String args[])
	{
		int n,n1,n2,sum=0,rem=0,sum1=0,rem1=0,count=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		n=111;
		n1=n*2;
		n2=n*3;
		for(;n>0;n/=10)
		{
			rem=n%10;
			sum=sum*10+rem;
			
		}
		for(;n1>0;n1/=10)
		{
			rem=n1%10;
			sum=sum*10+rem;
		}
		for(;n2>0;n2/=10)
		{
			rem=n2%10;
			sum=sum*10+rem;
		}
		for(;sum>0;sum/=10)
		{   
			rem1=sum%10;
			sum1=sum1*10+rem1;
		switch(rem1)
		{
			
				case 1: c1++;  break;
				case 2: c2++;  break;
				case 3: c3++;  break;
				case 4: c4++;  break;
				case 5: c5++;  break;
				case 6: c6++;  break;
				case 7: c7++;  break;
				case 8: c8++;  break;
				case 9: c9++;  break;
		}
		}
		if((c1==1&&c2==1&&c3==1&&c4==1&&c5==1&&c6==1&&c7==1&&c8==1&&c9==1))
			System.out.println("its a lappy number");
		else 
			System.out.println("its not a lappy number");
		
	}
}
		
			
		