package java_practice;
class ExtraxtionModel {

	public static void main(String[] args) {
		int num=2345,rem=0,sum=0,largest=0;
		for(;num>0;num/=10) {
			rem=num%10;
			if(rem>largest) {
				largest=rem;
			}
			sum+=rem;
			
		}
 System.out.println(sum);
 System.out.println(largest);
 System.out.println(args[0]);
	}
}