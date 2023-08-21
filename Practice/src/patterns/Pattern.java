package patterns;

public class Pattern {

	public static void main(String[] args) {
		int rows=5;
		int col=5;
		for(int x=1;x<=rows;x++) {
			for(int y=1;y<=col;y++) {
				if(x==y||x+y==6||x==1||y==1||x==rows||y==rows)
				
				System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
