import java.util.*;


class Fibprime
{
	public static void main(String args[])
	{
		int a=0,b=1,c=0,n=1,temp=0,x, y;
		System.out.print(a+"\t"+b+"\t");
		
		for(n=1;n<20;n++)	//1	//2
		{
			
             if(n%2==1)		//T	//F
              {
			c=a+b;		//1
			System.out.print(c+"\t");	//OUTPUT : 1//2//3
			
			a=b;		//a=1 b=1//1 2
			b=c;

		}
		else if(n%2==0)	//T
		{
			for(y=2;y<=n/2;y++)		//F
				{
					temp=0;
					if(n%y==0)
					{
						temp++;
						break;
					}
				}
				if(temp==0)	//T
				System.out.print(n+"\t");	// OUTPUT 2
				else
				n--;
				
			}
		}
	}
}
		
				