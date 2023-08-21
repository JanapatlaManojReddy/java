package basics;
import java.util.*;

public class PalindromRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		for(int x=num1;x<=num2;x++) {
			int rem=0,rev=0;
			for(int y=x;y>0;y/=10) {
				rem=y%10;
				rev=rev*10+rem;	
			}
			if(x==rev) {
				System.out.print(x+" ,");
			}
		}

	}

}
