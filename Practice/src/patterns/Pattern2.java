package patterns;

public class Pattern2 {

	public static void main(String[] args) {
//		int r=3,c=5;
//		for(int x=1;x<=r;x++) {
//			int num=65;
//			for(int y=1;y<=c;y++) {
//				if(y%2==1) {
//				System.out.print((char)num+" ");
//				num++;
//				}
//				else
//					System.out.print("# ");
//				
//			}
//			System.out.println();
//		}


//		int r=5,c=5;
//		for(int x=1;x<=r;x++) {
//			int num=2;
//			for(int y=1;y<=c;y++) {
//				if(x==1||y==1||x==r||y==c) {
//					System.out.print(0+"\t");
//				}
//				else
//				{
//					System.out.print(num*num+"\t");
//					num++;
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		int d=4;
//		for(int a=1;a<=3;a++) {
//			for(int b=1;b<=a;b++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int x=1;x<=d;x++) {
//			//for(int y=1;y<=x;y++) {
//				//System.out.print("  ");
//		//	}
//			for(int z=x;z<=d;z++) {
//				System.out.print("* ");
//				
//			}
//			System.out.println();
//		}
//		for(int a=2;a<=3;a++) {
//			for(int b=1;b<=a;b++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		int r=5;
//		for(int x=1;x<=r;x++) {
//			for(int y=1;y<=x;y++) {
//				if(y==1||x==r||y==x)
//				System.out.print("# ");
//				else
//					System.out.print("$ ");
//			}
//			System.out.println();
//		}
		
		int r=5;
		for(int x=1;x<=r;x++) {
			for(int y=1;y<=x;y++) {
			if(y%2==1)
				System.out.print("# ");
				else
					System.out.print("$ ");
			}
			System.out.println();
    	}	
		
		
		
		
		
	}

}
