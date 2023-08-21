package conditionalStatements;

public class StrongNumber {

	public static void main(String[] args) {
		int num=145,rem=0,add=0,fact=1;
		for(;num>0;num/=10) {
			fact=1;
			rem=num%10;
			for(int x=1;x<=rem;x++) {
			fact*=x;
			}
			add+=fact;
			
		}
System.out.println(add);
	}

}
