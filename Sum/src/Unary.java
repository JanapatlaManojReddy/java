class Unary
{
	public static void main(String args[])
	{
		int a=10,b,c; 
		b=(a++)+(++a);
		c=b++;
		System.out.println(a+"  "+b+"  "+c);
	}
}