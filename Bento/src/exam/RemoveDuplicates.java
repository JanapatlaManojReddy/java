package exam;

public class RemoveDuplicates {

	public static void main(String[] args) {
	  int a[]= {10,20,40,30,50,10,70,60,30,90,20,10,7,6,8,7,10};
	  boolean b[] = new boolean[a.length];
	  int count=1;
	  for(int x =0;x<a.length;x++) {
		  count=1;
		  for(int y=0;y<a.length;y++ ) {
			  if(a[x]==a[y]&&x!=y) {
				  b[x]=true;
				  count++;
			  }
		  }
		  if(b[x]==false) {
			  System.out.print(a[x]+" ");
		  }
	  }

	}

}
