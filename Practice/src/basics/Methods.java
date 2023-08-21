package basics;

public class Methods {
	
	
	public int p1(int m) {
		int count =0;
		for(int i=1;i<=m;i++) {
			if(m%i==0) {
				count++;
			}
			
		}
		return count;
		
	}
	public void p2(int m,int n) {
		int digit=0;
		if((p1(m)==2)&&((m+2==n)||(n==m-2))) {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					digit++;
				}
				
			}
			
		}if(digit==2)
		System.out.println("both are twin primes");
		}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Methods p = new Methods();
		
		 p.p2(13,11);
		

	}

}
