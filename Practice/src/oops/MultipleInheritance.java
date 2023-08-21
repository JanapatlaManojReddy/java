/*multiple inheritance in java is possible only through interface
 This is perfectly fine because the interfaces are only declaring the methods
  and the actual implementation will be done by concrete classes implementing the interfaces. 
  So there is no possibility of any kind of ambiguity in multiple inheritances in Java interfaces. 
  That’s why a java class can implement multiple interfaces
 */ package oops;
interface A1{
	public void m1();
	public void m2();
}
interface B1{
	public void m1();
	public void m4();
}
interface D1 extends A1,B1{
	public void m1();
}
class C1 implements A1,B1,D1
{


	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("all");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
	System.out.println("good morning");	
	}

	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			C1 c = new C1();
			c.m1();
	}

}
