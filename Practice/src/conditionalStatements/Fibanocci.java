package conditionalStatements;

public class Fibanocci {

	/*public static void main(String[] args) {
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" "+n2);
		for(int x=2;x<=10;x++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}*/
	
	// using recursion
	
	 static int n1=0,n2=1,n3=0;
	   static void fib(int count) {
		   if(count>0) {
			   n3=n1+n2;
			   n1=n2;
			   n2=n3;
			   System.out.print(" "+n3);
			   fib(count-1);
			   
		   }
	   }
		   
		
		
		
		public static void main(String args[]) {
			int count =10;
			
			System.out.print(n1+" "+n2);
			fib(count-2);
			
			
		}
	}


