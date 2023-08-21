import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int temp=0,a=2;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter range from");
		int x = sc.nextInt();
		System.out.println("enter range to");
		int y = sc.nextInt();
		System.out.println("prime no are");
		for (;x<=y;x++)
		{
			temp=0;
			
			for(a=2;a<=x/2;a++)
			{
				if(x%a==0)
				{
					temp++;
					break;
				}
			}
			if(temp==0)
				System.out.println(x);
		}
	}
}