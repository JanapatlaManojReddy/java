import java.util.Scanner;
 class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter your age");
	 int age=sc.nextInt();
	  if(age<18)
	     System.out.println("is a minor");
	  else
	     if(age>=18&age<50)
	     System.out.println("is an major");
	  else
	      if(age>50&age<90)
	       System.out.println("is a senior");
	       else
	         System.out.println("is in invalid");
	  
	}
}
 class Main2
{
	public static void main(String[] args) {
	    int a=20,b=49,c=16;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter your age");
	 int age=sc.nextInt();
	  if(age<99){
	     if(age>50)
	     System.out.println("is a senior");
	     if(age<50&age>18)
	     System.out.println("is an major");
	     if(age<18)
	     System.out.println("is a minor");
	      
	  }
	  else
	         System.out.println("is in invalid");
 System.out.println(c > (a > b ? a : b) ? c : (a > b ? a : b));
 System.out.println(a>b?(a>c?a:c):(b>c?b:c));


}
}