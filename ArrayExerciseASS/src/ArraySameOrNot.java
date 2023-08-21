
public class ArraySameOrNot {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,10,40,50,60};
		int b[]=new int[] {10,20,19,40,50,60};
		int count=0,sum=0;
		if(a.length==b.length)
		{
			for(int x=0;x<a.length;x++)
			{
				count=0;
				for(int y=0;y<b.length;y++)
				{
					if(a[x]==b[y]) 
						count++;
						
				}
				sum=sum+count;
			}
			if(sum==a.length)
			{
				System.out.println("the arrays are equal");
			}
			else 
				System.out.println("not same");
				
		}
	}
}		