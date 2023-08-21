import java.util.*;

class Fstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int rem=0,fact=1,x=1,add=0,temp=num;
		for(;num>0;num/=10)
		{
			fact=1;
			rem=num%10;
			for(x=1;x<=rem;x++)
			{
				fact=fact*x;
				
			}
           add=add+fact;  
		}
	   if(temp==add)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");
		
	}
}
		
			
	