/*constructors are spl type of methods whose names are same as class name
1)it initialize the obj 
2)every java class have a default constructor
3)constructor automatically called during obj creation
4)doesn't have return type
5)Every time an object is created using the new() keyword, at least one constructor is called.
6)There are two types of constructors in Java: no-arg constructor, and parameterized constructor.
7)A Java constructor cannot be abstract, static, final, and synchronized
syn-- class A = new Class(); 
--this keyword--
1)this keyword refers to the current class obj inside a method or constructor
2)this is a reference variable that refers to the current class obj
3)this refers to the current class instance variable*/
public class Constructor {
	String name;
	int rlno;
	Constructor(){
		this("manojreddy",33);
		this.name="manoj";
		this.rlno=25;
		System.out.println("hello all my name is manoj");
		
	}
	Constructor(String name,int rlno){
		//this();
		this.name=name;
		this.rlno=rlno;
		System.out.println(name+" "+rlno);
		
	}
	public void constructor() {
		System.out.println(name+" "+rlno);
		
	}
	public void constructor(int a,double b) {
		this.constructor();
		System.out.println(a+","+b);
		
	}

	public static void main(String[] args) {
		Constructor c=new Constructor();
		Constructor e=new Constructor("manu",22);
		c.constructor();
		e.constructor(22,2.2);
		//System.out.println(c.name);
		
	

	}

}
