/*
Exception?--an exceeption is an event that disrupts the normal flow of program.
its an Object which is thrown at the runtime.
* 2 types of exceptions 1) checked exceptions(compile time) 2) unchecked exceptions(runtime ).
* these exceptions are handled by 2 ways 1) try catch block 2) throws.
* object class-->throwable class-->exception class-->runtime Exception.
* If an exception occurs at the particular statement in the try block, the rest of the block code will not execute.
   So, it is recommended not to keep the code in try block that will not throw an exception.
* try catch and finally blocks are used to handling the exceptions
* throw -- the Java throw keyword is used to throw an exception explicitly. 
  We can throw either checked or unchecked exceptions in Java by throw keyword.
  It is mainly used to throw a custom exception. We will discuss custom exceptions later in this section.
 syntax--throw new exception_class("error message");
*Note: If we throw unchecked exception from a method, it is must to handle the exception or
 declare in throws clause.
 
  
 */
package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		

	}

}
