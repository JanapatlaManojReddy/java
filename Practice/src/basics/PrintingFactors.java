package basics;

public class PrintingFactors {

	public static void main(String[] args) {
		int count=0;
		
		for(int x=1;x<=10;x++) {
			count=0;
			System.out.print(x+" factorials are ");
			for(int y=1;y<=x;y++) {
				if(x%y==0) {
					System.out.print(y+",");
					count++;
				}
				
			}
			System.out.print("  count = "+count);
			System.out.println();
		}

	}

}
