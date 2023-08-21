class Fizzbuzz
{
	public static void main(String args[])
	{
		 int a=7,b=3,c=5;
             if(a%b==0&&a%c==0)
	            {
			     System.out.println("FIZZBUZZ");
	            }
		         else{
                     if(a%b==0)
			            System.out.println("fizz");
		             if(a%c==0)
			            System.out.println("buzz");
			         else 
			             System.out.println(a);
		         }
	}		         
}
		