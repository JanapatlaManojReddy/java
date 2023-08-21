package exam;

public class FindingFirstNonRepeatingLetter {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		int count=0;
		char c[]=s.toCharArray();
		for(int x =0;x<c.length;x++) {
			count=0;
			for(int y=0;y<c.length;y++) {
				if(c[x]==c[y]&&x!=y) {
					count++;
				}}
				if(count==0) {
					System.out.println(c[x]);
					break;
				}
				
			
		}

	}

}
