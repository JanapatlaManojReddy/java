package basics;

public class StrongNumber {

	public static void main(String[] args) {
		int num=145;
		int rem=0;
		int fact=1;
		int sum=0;
		for(int x=num;x>0;x/=10) {
			 rem=x%10;
			 fact=1;
			 for(int y=1;y<=rem;y++) {
				 fact=fact*y;
			 }
			 sum=sum+fact;
			
		}
		if(num==sum)
		System.out.println(sum);

	}

}
