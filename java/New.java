
class NewSuper extends Thread
{
	NewSuper(int a)
	{
		
	}
	NewSuper(char a)
	{
		
	}
	public void run()
	{
		
	}
}
class NewSub extends NewSuper
{
	NewSub()
	{
		super(10);		
	}
	
}
public class New {

	public static void main(String[] args) 
	{
		NewSub nb = new NewSub();	
	}

}
