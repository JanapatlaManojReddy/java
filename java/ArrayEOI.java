
public class ArrayEOI {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,30,40,50,60};
		int zrr[]=new int[arr.length];
		int y=0;
		for(int x=0;x<arr.length;x++)
		{
			if(x%2==0) {
				zrr[y]=arr[x];
				y++;
			}
			
		}
		for(int x=0;x<arr.length;x++)
		{
			if(x%2==1) {
				zrr[y]=arr[x];
				y++;
			}
		}
		for(int x=0;x<zrr.length;x++) {
			System.out.println(zrr[x]+" ");
		}
			
	}

}
