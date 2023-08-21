//swapping the adjacent elements
public class C1Q6 {

	public static void main(String[] args) {
		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		for(int x=0;x<arr.length;x=x+2)
		{
			arr[x]=arr[x]+arr[x+1];
			arr[x+1]=arr[x]-arr[x+1];
			arr[x]=arr[x]-arr[x+1];
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
	}

}
