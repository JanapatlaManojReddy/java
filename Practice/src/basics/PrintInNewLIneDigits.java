package basics;

public class PrintInNewLIneDigits {

	public static void main(String[] args) {
		
		int n = 1345;
		int rev=0,rem=0;
		for(;n>0;n/=10) {
			rem=n%10;
			rev=rev*10+rem;
			
		}
		int res =rev;
		for(;res>0;res/=10) {
			rem=res%10;
			if(rem%2==0) {
				rem=rem+2;
			}
			else {
				rem=rem+1;
			}
			System.out.print(rem);
			
		}
	}

}
