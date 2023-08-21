package conditionalStatements;

public class ForloopPRIME {

	public static void main(String[] args) {
	 int count=0;
	 for(int num=2;num<100;num++) {
		
	 count=0;
	 for(int x=2;x<=num/2;x++) {
		 if(num%x==0) {
			 count++;
			 break;
			 
		 }
	 }
	 if(count==0) {
		 System.out.println(num+" is a prime");
	 }

	}

	}}
