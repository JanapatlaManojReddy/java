package conditionalStatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=num,count=0,rem=0,res=0,arm=0,pow=1;
		for(;num>0;num/=10) {
			count++;
		}
		num=temp;
		for(;num>0;num/=10) {
			rem=num%10;
			{
				pow=1;
				for(int x=0;x<count;x++) {
					pow=pow*rem;
					
				}
			}
			arm=arm+pow;
			
			
		}
		if(temp==arm)
		System.out.println(arm+" its a armstrong number");

	}

}
