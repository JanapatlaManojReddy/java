package oops;
class Parent111{
	String color="black";
	int b;
	Parent111(){
		System.out.println("parent class");
				
	}
	void parentss() {
		System.out.println("parent class method");
		System.out.println(b);
	}
}
class Child111 extends Parent111{
	String color="white";
	Child111(){
		
		super();
		System.out.println("child class");
		
	}
	void prints() {
		super.parentss();
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Child111 c= new Child111();
		Parent111 p = new Parent111();
		c.b=22;
		p.parentss();
		System.out.println();
		c.prints();
		
		

	}

}
