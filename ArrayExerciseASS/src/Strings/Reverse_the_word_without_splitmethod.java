package Strings;

public class Reverse_the_word_without_splitmethod {

	public static void main(String[] args) {
		 String s1=new String("Hello all Good morning");
	     
	     int z=0,c=0;
	       for(int x=0;x<s1.length();x++)	//0<22
	         {
	    	   	
	             c++;//0//1//2//3//4//5
	             //System.out.println(c);
	            if(s1.charAt(x)==' '||x==(s1.length()-1))
	            {
	            	String s2="";
	                for(int y=c-1;y>=z;y--)	//5-1//4>=0
	                {
	                	
	                    s2=s2+s1.charAt(y);	 //olleH              
	                }
	                System.out.print(s2+" ");
	                z=x+1;	//5
	            }  
	        }

	}

}
