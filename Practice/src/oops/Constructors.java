package oops;

public class Constructors {
	Constructors(){
		System.out.println("default constructor");
		
	}
	Constructors(int a){
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		
		Am ref= new Am();
		ref.dis();
		Constructors c= new Constructors(20);
		
		

	}

}
class Am{
	int a;
	String s;
	boolean c;
	Am(){//default constructor
		this(122,"manoj",true);
		a=122;
		s="manoj";
		c=false;
		System.out.println(a+s+c);
		
	}
	Am(int a,String s,boolean c){
		
		this.a=a;
		this.s=s;
		this.c=c;
		System.out.println(a+s+c);
		
	}
	void dis() {
		System.out.println(a+s+c);
	}
	
}
