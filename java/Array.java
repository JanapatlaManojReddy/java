//left rotate 3 in 2 methods .printing directly and storing and print
public class Array {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,30,40,50,60,70,80,90};
		int zrr[]=new int [arr.length];
		int  lr=3;
		int y=0;
		for(int x=lr;x<arr.length;x++)
		{
			zrr[y]=arr[x];
			y++;
			System.out.println(arr[x]+" ");
		}
		for(int x=0;x<lr;x++)
		{
			zrr[y]=arr[x];
			y++;
			System.out.println(arr[x]);
		}
		for(int x=0;x<zrr.length;x++)
		{
			System.out.print(zrr[x]+" ");
		}

	}

}
