import java.util.*;
/*
class Palin
{
	public static void main(String args[])
	{     
		Scanner sc = new Scanner(System.in);
		System.out.println("enter from");
		int x = sc.nextInt();
		System.out.println("enter to");
		int y = sc.nextInt();
		int num=0,rem=0,rev=0,copy=0;
		for(;x<y;x++)
		{
			num=x;rev=0;
		 
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev= rev*10+rem;
		}
		num=copy;
		if(x==rev)
			System.out.println(x);
		
		}
	}
}



//model 1   return type : void
	
class Palin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		User1 u = new User1();
		u.num = sc.nextInt();
		u.palin1();
		u.palinn();
	}
}
class User1
{
	int num,rev;
	public void palin1()
	{
		int rem=0,copy=num;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
		num=copy;
	}
	public void palinn()
	{
		
			if(num==rev)
			System.out.println("palin");

	}
}

 
//model 2     return type : data types 
class Palin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		User2 u = new User2();
	   u.num=sc.nextInt();
	   int m = u.palin2();
		
		if (m==u.num)
			System.out.println("is palin"); 	
	 
	}
}
class User2
{
	int num,rev;
	public int palin2()
	{
		int rem=0;
		int temp=num;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
			num=temp;
			return rev;
	}
}
*/

// model 3 passing Parameters

class Palin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter from");
		int num1=sc.nextInt();
		System.out.println("to");
		int num2=sc.nextInt();
		User1 u = new User1();
		for(;num1<=num2;num1++)
		{
		int result = u.palin3(num1);
		u.palinn(num1,result);
		
		}
		
	}
}
class User1
{	
	int rev,rem;
	public int palin3(int num)
	{
		int temp=num;rev=0;
		for(;num>0;num/=10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}	
			num=temp;
			return rev;
	}
	public void palinn(int num,int result)
	{
		if(num==result)
		System.out.println(num +"is a palindrom");
	}
	
}
