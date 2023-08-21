import java.util.*;
class Multiplication
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();
		int i=1,num=10,result=1;
		while(i<=num)
		{
			result=n*i;
			System.out.println(n+" x"+i+" = "+result);
			i++;
		}
	}	
}