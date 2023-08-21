/*performing a single action in different ways
1)it occurs when we having many classes that are related to each other by inheritance
2)polymorphisam uses the methods to perform different tasks
3)2 types compiler time poly( overloading - 1)method overloading and 2)constructor overloading
		2)runtime poly(overriding 1) method overriding.
 1)overloading --having same method or constructor names but different parameters
  		--with in the same class.
  		-- no inheritance concept for overloading
 2)overriding --having same method names and same parameters
 		-- in different classes
 		-- inheritance is mandatory.
 3)final ,static and private methods are not overiden
 */
package oops;
class Parent1{
	String name1= "wonder";
	String name;
	int rlno;
	Parent1(){
		name="manoj";
		rlno=22;
		System.out.println(name+" "+rlno);
		
	}
	Parent1(String name,int a){
		this();
		this.name=name;
		rlno=a;
		System.out.println(name+" "+rlno);
		
	}
	Parent1(String name,char c){
		this.name=name;
		System.out.println(name+" "+c);
		}
	void main1() {
		System.out.println("parent method 1"+name+" "+rlno);
	}
	void main1(int a)
	{
		this.main1();
		System.out.println("parent"+a);
	}
}
class Child1 extends Parent1{
	String name1="winner";
	Child1(){
		
		name="manoj";
		rlno=45;
	}
	Child1(String name,int b){
		super();
		super.main1();
		System.out.println(name1);
		System.out.println(super.name1);
		rlno=b;
		System.out.println(name+" "+rlno);
		
	}
	Child1(char c){
		name ="win win";
		System.out.println(c);
		
	}
	void main1() {
		System.out.println("i am in child method");
	}
	void main1(int b) {
		super.main1( b);
		System.out.println(b);
	}
	void main2(char c) {
		System.out.println(c);
	}
	
}
public class Polymorphisam {

	public static void main(String[] args) {
		Child1 p = new Child1("fisrt",22);
		p.main1();
		
		Parent1 p2= new Child1();
		//p2.main2();
		p2.main1();
	}

}
