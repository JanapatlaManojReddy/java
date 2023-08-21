class Fprime
{
	public static void main (String args[])
	{
		int n =10,temp=0;
		for(int x=2;x<=n/2;x++)
		{
			
			if(n%x==0){
				temp++;
				break;}
			
		}
			if(temp==0)
				System.out.println();
			else 
				System.out.println("its not a prime");
	}
}
			
		
			 