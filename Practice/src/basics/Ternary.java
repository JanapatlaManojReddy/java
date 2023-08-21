package basics;

public class Ternary {

	public static void main(String[] args) {
		int a =10,b=2,c=3;
		int x = (a>b?(a>c?a:c):(b>c?b:c));
		
		System.out.println(x);
		
		int y=((a>b?a:b)>c?(a>b?a:b):c);
		
		System.out.println(y);
		

	}

}
