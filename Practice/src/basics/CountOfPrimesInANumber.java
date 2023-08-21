package basics;

public class CountOfPrimesInANumber {

	public static void main(String[] args) {
		int num=1576,rem=0,count=0,digit=0;
		for(;num>0;num/=10) {
			rem=num%10;
			count=0;
			for(int i =1;i<=rem;i++) {
				if(rem%i==0) {
					count++;
				}
				
			}
			if(count==2) {
				digit++;
			}
			
		}
		System.out.println(digit);

	}

}
