class E1p2
{
	public static void main(String args[])
	{
		int a=3,b=7,c=1;
       System.out.println( a<b?(a<c?a:c):(b<c?b:c));
	}
}

class E1p3
{
	public static void main(String args[])
	{
		int a=0,b=1,c=0,i=1,n=7;
		System.out.print(a+"\t"+b+"\t");
		while(i<=n){
		c=a+b;
            System.out.print(c+"\t");
		a=b;
		b=c;
		
		i++;
		}
	}
}

class E1p4
{
	public static void main(String args[])
	{
		int m=5,n=10,x=1,pow=1;
		while(x<=n){
			pow=pow*m;
			x++;}
		System.out.println(pow);
	}
}