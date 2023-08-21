package Strings;

public class String_methods {

	public static void main(String[] args) {
		String s1=new String("manoj");
		String s2=new String("Manoj");
		String s3=("Surya");
		String s4=("Nithin");
		String s5="";
		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s5=s5+s1.toUpperCase());
		if(s1.equalsIgnoreCase(s2)&&s3==s4)
		{
			System.out.println("equal");
		}
		System.out.println(s1.compareTo(s2)==32);//boolean
		System.out.println(s1.concat(s2));
		System.out.println(s3.concat("hi"));//string
		System.out.println(s1.contains("ma"));//boolean
		
		
		
		

	}

}
