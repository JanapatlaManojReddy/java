package exam;
import java.util.*;

public class StringContains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter strings ");
		String aa=sc.next();
		String bb=sc.next();
		int count=0;
		
		
		
		for(int x=0;x<aa.length();x++) {
			
			for(int y =x;y<bb.length();y++) {
				if(aa.charAt(x)==bb.charAt(y)) {
					count++;
					break;
				
				
			}
			
		}
			
			}
		if(count==aa.length()) {
			boolean bbb=count==aa.length();
			System.out.println(bbb);
		}
		else {
			System.out.println("false");
		}
		
		
		
	}

}
		
		