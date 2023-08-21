package basics;

import java.util.Scanner;

public class Methods2 {
	
	
	
	public int  m1(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		return count;
	}
	
	
	public void m2(int n) {
		int rev=0,rem=0;
		if(m1(n)==2) {
			for(;n>0;n/=10) {
				rem=n%10;
				rev=rev*10+rem;
				
			}
			int digit=0;
			for(int i=1;i<=rev;i++) {
				
				if(rev%i==0) {
					digit++;
				}
			}
				if(digit==2) {
					System.out.println("perfect");
				}
				else {
					System.out.println("the number is not a perfect");
				}
			}
		else {
			System.out.println("the given number is not prime");
		}
			
		}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		Methods2 m= new Methods2();
		m.m2(sc.nextInt());
		
		

	}

}
