import java.util.Scanner;


class Sapp
{
	public static void main(String args[])
	{
		
		String ch;
		
	
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STUDENT NAME");
		String name = sc.next();
		System.out.println("ENTER ROLL NUMBER");
		int roll = sc.nextInt();
		System.out.println("ENTER SECTION");
		char section = sc.next().charAt(0);
		System.out.println("ENTER OBTAINED MARKS");
		double obtainedmarks = sc.nextDouble();
		System.out.println("ENTER FEES");
		double Fees = sc.nextDouble();
			
		double percentage, totalmarks = 120.0, concession=0;
		percentage = (obtainedmarks/totalmarks)*100;
		System.out.println("Percentage = " + percentage);
		
		if (percentage >= 70)
		{
			concession = (20.0/100)*Fees;
		}
		else 
		{
			concession = (10.0/100)*Fees;
		}
		System.out.println("concession = " + concession);
		Fees = Fees-concession;
		System.out.println(Fees);
				
			
		
		System.out.println("Do YOU WANT TO CONTINUE");
		ch = sc.next();
		
		}
		while(ch.equalsIgnoreCase("YES"));		
	}
}