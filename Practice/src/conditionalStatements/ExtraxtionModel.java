package conditionalStatements;

public class ExtraxtionModel {

	public static void main(String[] args) {
		int num=145,rem=0,sum=0,largest=0,small=10,seclarge=0,fact=1,add=0;
		for(;num>0;num/=10) {
			rem=num%10;
			if(rem>largest) {
				largest=rem;
				
			}
			if(rem<small) {
				small=rem;
			}
			sum+=rem;
			
		}
		
		num=234175;
		for(;num>10;num/=10) {
			rem=num%10;
			if(rem>seclarge&&rem<largest) {
				seclarge=rem;
			}
			
		}
 System.out.println(sum);
 System.out.println(largest);
 System.out.println(small);
 System.out.println(seclarge);
 
 
 
 num=22222222;
 int rev=0,temp=num,sum1=0;
 for(;num>0;num/=100) {
	 rem=num%100;
	 rev=rev*100+rem;
	 
	 
	 
 }
 
 if(rev==temp) {
	 System.out.println("polin");
	
 }
 
	}

}
