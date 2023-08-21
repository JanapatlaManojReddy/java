class Pattern2
{
	public static void main(String args[])
	{
		int x,y;
		for (x=1;x<6;x++)
		{
			for(y=1;y<6;y++)
			{
				if(x==y)
				System.out.print(" * ");
				else 
				System.out.print("   ");
			}
		    System.out.println();
		}
		
	}
}
				