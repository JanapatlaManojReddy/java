package conditionalStatements;
import java.util.Scanner;
//if 
//if-else
// if else if
//nested if
public class IF {
	//leap year
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a year");
	 
	 int year =sc.nextInt();
	
	if((year%4==0&&year%100!=0)||(year%400==0)){
		System.out.println("leap year");
		sc.close();
	}
	else {
		System.out.println("not a leap year");
	}
}
}
