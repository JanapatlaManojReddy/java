package basics;
import java.util.*;

public class Fibanacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter range");
		
		int range = sc.nextInt();
		
		int a= 0,b= 1,c,n=range-2;
		
		System.out.print(a+" "+b+" ");
		
		
		
		while(n>0) {
			
			c=a+b;
			
			System.out.print(c+" ");
			
			a=b;
			
			b=c;
			
			n--;	
		}

	}

}
