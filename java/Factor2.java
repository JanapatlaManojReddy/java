class Factor2
{
	public static void main(String args[])
	{
		int i=1,n1=5,n2=3,fact1=1,fact2=1,fact3=1,npr=0;
			while(i<=n1)
			{
				fact1=fact1*i;
			i++;
			}
			i=1;
			while(i<=n2)
			{
				fact2=fact2*i;
			i++;
			}
			i=1;
			int r=n1-n2;
			while(i<=r)
			{
				fact3=fact3*i ;
			i++;
			}
		npr=(fact1/(fact2*fact3));
		System.out.println(npr);
	}
}