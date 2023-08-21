/*hiding the internal implementation and showing the functionality
1)abstraction can be done in 2 ways 
	1)abstraction class(0-100%)
	0-100 because it may or maynot contain abstract methods 
	if it contains all the abstract methods then gives 100%
	--abstract method means the method which doesn't have implementation.
	2)interface(100%)
	all the methods in the interface are abstract methods whether you use abstract keyword or not .
    -- using interface multipole inheritance is possible
2)in abstraction only IS -A relationship is used .
3)points to be remembered 
	An abstract class must be declared with an abstract keyword.
	It can have abstract and non-abstract methods.
	It cannot be instantiated.
	It can have constructors and static methods also.
	It can have final methods which will force the subclass not to change the body of the method.
 */  
//abstraction using classes.
package oops;
/* abstract class AbClass1{
	 AbClass1(){
		 
	 }
	 public abstract void method1();
	 public void method2() {
		 System.out.println("i am a concret method in abstract class");
	 }
 }
 class AbClass2 extends AbClass1{
	 public void method1() {
		System.out.println("i have overridden of abstract method");
	 }
	 public void method2()
	 {
		 System.out.println("i am overriding method2"); 
	 }
 }
*/
//abstraction using interface
interface I{
	//public abstract void display();
	public void display();
	public void discount();
}
class A implements I
{
	public void display() 
	{
	System.out.println("hello");	
	}
	public void discount() {
	System.out.println("hi");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		//AbClass1 c = new AbClass2();
		//c.method2();
		A a= new A();
		I i = new A();
		a.display();
		i.display();
		

	}

}
