package basics;

public class ArmStrongRange {

	public static void main(String[] args) {
		int num2=100000;
		for(int num1=10000;num1<=num2;num1++) {
			
			int count=0;
			int rem=0;
			int sum=0;
			for(int x=num1;x>0;x/=10) {
				count++;
			}
			for(int y=num1;y>0;y/=10) {
				//rem=y%10;
				sum=sum+(int)(Math.pow((y%10), count));
			}
			if(sum==num1) {
				System.out.println(num1);
				
				
				
			}
			
		}

	}

}
