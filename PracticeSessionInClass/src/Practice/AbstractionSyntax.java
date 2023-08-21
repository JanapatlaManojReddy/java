package Practice;

public class AbstractionSyntax {

	public static void main(String[] args) {
		A a=new A();
		Home h = new A();// upcasting
		//A a = new Home();//downcasting not possible 
		a.display();
		a.discount();
		h.discount();
		h.discount();

	}

}
abstract class Home{
	public abstract void discount();
	public void display() {
		System.out.println("hello");
	}
}
class A extends Home{
	public void discount() {
		System.out.println("hi");
	}
	public void display() {
		System.out.println("i am in non abstract class");
	}
}
