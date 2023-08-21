  class Order
{
	public static void main(String[] args) {
		int a=46,b=30,c=10,d=0,e=0,f=0;
		if(a>b)
		{
		   d=a;
		   a=b;
		   b=d;
		}  
		
		if(b>c)
		 {
		   e=c;
		   c=b;
		   b=e;
		 }
		if(a>b)
             {
		   f=a;
		   a=b;
		   b=f;
             }
		 
	System.out.println(a+"   " +b+ "   " +c); 
	}
}
