package basics;

public class TwoTimesRiverseANumberHavingZeros {

	public static void main(String[] args) {
		int num=1200;
		int rem=0,rev=0,count=0,result=0,m=10,n=count,pow=1;
		for(;num>0;num/=10) {
			rem=num%m;
			if(rem==0) {
				count++;
			}
			rev=rev*10+rem;
			
		}
		System.out.println(rev);
		for(;rev>0;rev/=10) {
			rem=rev%m;
			result=result* 10+rem;
			
		}
		for(int z=0;z<count;z++) {
			result*=m;
			//pow*=10;
		}
		System.out.println(result);
		//System.out.println(result*(int)Math.pow(10,count));

	}

}
