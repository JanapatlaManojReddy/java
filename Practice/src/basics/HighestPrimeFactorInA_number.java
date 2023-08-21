package basics;

public class HighestPrimeFactorInA_number {

	public static void main(String[] args) {
		int num=12,HPF=0,f=0,count=0,x=1;
		for(int n=num;n>0;n--) {
			count=0;
			if(num%n==0) {
				f=n;}
				for(;x<=f;x++) {
					if(f%x==0) {
						count++;
					}
					if(count==2) {
						HPF=f;
						break;
					}
					
				
				}
	
		if(HPF>0) 
			
		System.out.println(HPF);
		break;
		}
		}
}
				
		
