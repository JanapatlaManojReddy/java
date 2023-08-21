import java.util.*;
class LPF
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int x,y,count=0,temp=0;
		
	
		for(x=1;x<=num;x++)
		{
			count=0;
			if(num%x==0)
				{
					System.out.println(x);
					for(y=2;y<=x/2;y++)
					{
						if(x%y==0)
						{
							count++;		
							break;
						}
					}
					if(count==0){
						if(x>temp)
							temp=x;
					}
				}
		

		}
		System.out.println("largest prime factors"+temp);
	}
}
				
		