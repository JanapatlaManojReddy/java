//PALINDROME RANGE AND SOME OF PALINDROME DIGITS

class Palindrome
{
	public static void main(String args[])
	{
		int rem=0,rev=0,count=0,num=0,sum=0,x=1;
		
	for(;x<=9;x++)
		{
			num=x;rev=0;sum=0; 
			for(;num>0;num/=10)
			{
				rem=num%10;
				rev=rev*10+rem;
			}
			num=x;
				if(num==rev)		
				{
	
					System.out.println(num+" is a polindrom");
					count++;
					sum=sum+num;	
				}
		}
		System.out.println(sum);
	}	
}