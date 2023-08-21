//right rotation
public class ArrayRR {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,30,40,50,60,70};
		int zrr[]=new int[arr.length];
		int rr=3;
		int y=0;
		for(int temp:arr)
			System.out.print(temp+" ");
		System.out.println("\n");
		for(int x=arr.length-rr;x<arr.length;x++)
		{
			zrr[y]=arr[x];
			y++;
			System.out.print(arr[x]+" ");
			
		}
		
		for(int x=0;x<arr.length-rr;x++)
		{
			zrr[y]=arr[x];
			y++;
			System.out.print(arr[x]+" ");
		}
		System.out.println("\ncopy to another array\n");
		for(int x =0;x<zrr.length;x++)
		{
			System.out.print(zrr[x]+" ");
		}
	}

}
