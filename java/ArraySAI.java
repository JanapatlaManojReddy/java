
public class ArraySAI {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int zrr[]=new int[arr.length];
		for(int x=0;x<arr.length;x++)
		{
			if(x==0) {
			zrr[x]=arr[x]+arr[x+1];
			}
			else if(x>0&&x<arr.length-1)
			{
				zrr[x]=arr[x-1]+arr[x+1];
			}
			else {
				zrr[x]=arr[x]+arr[x-1];
			}
			
		}
		for(int x=0;x<zrr.length;x++)
		{
			System.out.println(zrr[x]+ " ");
		}
	}

}
