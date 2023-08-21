package basics;

public class Swapping {

	public static void main(String[] args) {
		int a= 30;
		int b=40;
		int c=50;
		/*c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a=a+b;
	 b=a-b;
	a=a-b;
		System.out.println(a);
		System.out.println(b);*/
        int temp=0; 
		if(a>b) {
			
		}
		else {
			temp =a;
			a=b;
		       b=temp;
		}
			
		if(b>c) {
			
		}
		else {
			temp=b;
			b=c;
			c=temp;
		}
		
		if(a>b) {
		
			
		}
		
		else {
			temp=b;
			b=a;
			a=temp;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

}
}