package basics;

public class Repeatations {

	public static void main(String[] args) {
		String s = new String("kuchulu");
		
		boolean b[]= new boolean[s.length()];
		for(int x=0;x<s.length();x++) {
			int count =1;
			
			for(int y=0;y<s.length();y++) {
				if(s.charAt(x)==s.charAt(y)&&x!=y) {
					b[y]=true;
					count++;	
				}
				}
				if(b[x]==false&&count>1) {
					System.out.println(s.charAt(x)+" "+count);
				}
			}
		}

	

}
