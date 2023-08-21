
/*1)the process in which the child class acquiring the properties and behaviours of a parent class.
2)object class is the super or parent class for all the classes.
3)extends keyword is used to perform inheritance.
4)we cannot access the private members of class through inheritance.
5)a sub class contains all the features of parent class and it may have some extra properties as well.
6)we should create obj for sub class as it extends the parent class.
7)method overriding or runtime polymorphisam is possible through inheritance .
8)we cannot perform multiple inheritance using classes.(2 or more parents and one child).
9)if we use final keyword in parent class then inheritance is not possible.
10)syn--class child extends parent{}.
11)
   
 */
package oops;
class Parent{
	String name;
	int rlno;
	int id =22;
	Parent(String name){
		this.name=name;
		//rlno=21;
		System.out.println("i am a parameterized parent constructor" +" "+ name);
	}
	Parent(String name,int rlno){
		this.name=name;
		this.rlno=rlno;
		System.out.println(name+" "+rlno);
		
	}
	public void main1() { 
		System.out.println("i am in parent class  "
				+ ""+name+" "+rlno);
	}
}
class Child extends Parent{
	String name;
	int rlno;
	int id1 =24;
	Child(String name){
	 super(name);
		//System.out.println(" iam a child constructor");
	}
	Child(String name,int rlno){
		super(name,rlno);
		this.name=name;
		this.rlno=rlno;
		System.out.println(name+" "+rlno);
		
	}
	public void main2() {
		
		System.out.println("i am in child class  "+name+" "+rlno);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Child c = new Child("manoj");
		
		
		System.out.println(c.id+"   "+c.id1);
		
		
		Child d=new Child("kuchulu",23);
		d.main1();
		d.main2();
	}
}