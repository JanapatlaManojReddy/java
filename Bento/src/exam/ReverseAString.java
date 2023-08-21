package exam;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "Assetmonk";
		for(int x=s.length()-1;x>=0;x--) {
			System.out.print(s.charAt(x));
		}

	}

}
