package basics;

public class Patternss {

	public static void main(String[] args) {
		int row =3;
		int num=1;
		for(int x=1;x<=3;x++) {
			for(int y=1;y<=x;y++) {
				if(x==row&&y==row) {
					System.out.print(0+" ");
				}
				else
				System.out.print(num+" ");
				num++;
				
				
			}
			System.out.println();
		}

	}

}
