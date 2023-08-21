/*Encapsulation(data hiding):-- wrapping up of data(variables/properties) and methods ( behaviour) 
 * as a single unit is called encapsulation.
 	(or)
 * the ability of the object to hide the data members from the rest of the world .
 1)We can create a fully encapsulated class in Java by making all the data members of the class private.
 2)Now we can use setter and getter methods to set and get the data in it.
 3)The Java Bean class is the example of a fully encapsulated class(it have a private data member and getter and setter methods).
*/

package oops;

public class Encapsulation {

	public static void main(String[] args) {
		Student s = new Student();
		//s.name="manoj"; we cannot initialize value here as the student class variable is private.
		s.setName("manoj");
		System.out.println(s.getName());
		

	}

}
class Student{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
