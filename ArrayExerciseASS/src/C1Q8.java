 //first half ascending order and next half in descending order
public class C1Q8 {

	public static void main(String[] args) {
		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		for(int temp:arr)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		for(int x=0;x<arr.length/2;x++)
		{
			for(int y=x+1;y<arr.length/2;y++)
			{
			if(arr[x]>arr[y])
			{
				int temp = arr[x];
				arr[x]=arr[y];
				arr[y]=temp;
			}
			}
		}
		System.out.println();
		for(int x=(arr.length/2);x<arr.length;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
			if(arr[x]<arr[y])
			{
				int temp = arr[x];
				arr[x]=arr[y];
				arr[y]=temp;
			}
			}
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
	}

}
