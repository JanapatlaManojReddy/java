package basics;

public class Pattern12 {

	public static void main(String[] args) {
		int row=10;
		
		//p1(row);
		//p2(row);
		//p3(row);
		//p5(row);
		p5(row);
	}
	
	
	
	
	
		public static void p2(int row) {
		for(int x=1;x<=row;x++) {
			
			for( int y=1;y<=x;y++) {
				if(x==y||y==1)
				System.out.print(x+" ");
				else
					System.out.print("# ");
				
			}
			System.out.println();
			
		}
		for(int x=row-1;x>=1;x--) {
			for(int y=1;y<=x;y++) {
				if(x==y||y==1)
				System.out.print(x+" ");
				else
					System.out.print("# ");
			}
			System.out.println();
		}
	}
		
		
		
		
		public static void p1(int row) {
			for(int x=1;x<=row;x++) {
				int sum=x;
				for( int y=1;y<=x;y++) {
					System.out.print(sum+" ");
					sum--;
				}
				System.out.println();
				
			}
			for(int x=row-1;x>=1;x--) {
				for(int y=1;y<=x;y++) {
					System.out.print(y+" ");
				}
				System.out.println();
			}
		}	
		
		
		
	public static void p3(int row) {
		
		for(int x=1;x<=row;x++) {
			int num=1;
			for(int y=row;y>=x;y--) {
				System.out.print("- ");
			}
			for(int z=1;z<=x;z++) {
				 
				System.out.print(z*z+" ");
				
			}
			for(int m=x-1;m>=1;m--) {
				System.out.print(m*m+" ");
			}
			
			
			System.out.println();
		}
	}
	 
	public static void p4( int row) {
		
		for(int x=1;x<=row;x++) {
			for(int s=row;s>x;s--) {
				System.out.print("  ");
			}
			for(int y=1;y<=(2*x-1);y++) {
				if(y==1||y==(2*x-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
			
		}
		for(int x=row-1;x>=1;x--) {
			for(int s=row-1;s>=x;s--) {
				System.out.print("  ");
			}
			for(int y=(2*x-1);y>=1;y--) {
				if(y==1||y==(2*x-1))
				System.out.print("* ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
	}
	
	
	public static void p5(int row) {
		
		for(int x=row;x>=1;x--) {
			for(int s=row;s>x;s--) {
				System.out.print("  ");
			}
			for(int y=(2*x-1);y>=1;y--) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		for(int x=2;x<=row;x++) {
			for(int s=row;s>x;s--) {
				System.out.print("  ");
			}
			for(int y=1;y<=(2*x-1);y++) {
				
					System.out.print("* ");
				
			}
			System.out.println();
			
		}
	}
//		public static void p6(int row) {
//		for(int x=1;x<=row;x++) {
//			for(int y=1;y<=x;y++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
	
		
		
	}
	
	
	
	
	




