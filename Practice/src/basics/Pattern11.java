package basics;

public class Pattern11 {

	public static void main(String[] args) {
		int row=5;
		int num=1;
		for(int x=1;x<=row;x++) {
			
			for(int y=1;y<=x;y++) {
				if(y==1||x==y||x==row) {
				System.out.print(num+" ");
				}
				else
					System.out.print("# ");
				
				
			}
				num++;
			System.out.println();
		}
		
	System.out.println("");
	}

}
