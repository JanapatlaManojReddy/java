
public class C1Q9 {

	public static void main(String[] args) {
		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		for(int m:arr)
		{
			System.out.print(m+" ");
		}
		System.out.println();
				for(int x=0;x<arr.length;x++)
				{
					for(int y=x+1;y<arr.length;y++)
					{
						if(x%2==0) {
						if(arr[x]<arr[y])
						{
							int temp = arr[x];
							arr[x]=arr[y];
							arr[y]=temp;
						}			
						}
						if(x%2!=0) {
						if(arr[x]>arr[y])
						{
							int temp = arr[x];
							arr[x]=arr[y];
							arr[y]=temp;
						}
						}
					}
				}
				for(int x=0;x<arr.length;x++)
				{
					System.out.print(arr[x]+" ");
				}
	}

}
