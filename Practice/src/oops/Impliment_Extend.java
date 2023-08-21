/*at a time implementation and extend
 thread class & runnable interface are found in lang package
 */
package oops;
class X extends Thread{
	public void run() {
		System.out.println("hello");
	}
}
class Y implements Runnable{
	public void run() {
		System.out.println("runnable");
	}
}
class ZImpl extends Thread implements Runnable{
	public void run() {
		System.out.println("good morning");
	}
}

public class Impliment_Extend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		x.start();
		Y y = new Y();
		Thread t = new Thread(y);
		t.start();
		ZImpl z = new ZImpl();
		Thread t1= new Thread(z);
		t1.start();

	}

}
