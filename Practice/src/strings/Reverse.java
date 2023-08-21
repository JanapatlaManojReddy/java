package strings;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		
	
	String s = new String("hello good morning");
	String rev="";
	
	String[] arr=s.split(" ");
	for(int i=0;i<arr.length;i++) {
		 rev= "";
		
		for( int j=arr[i].length()-1;j>=0;j--) {
			rev+=arr[i].charAt(j);
			
		}
		System.out.print(rev+" ");
	}
	
		 

	
	}
}
