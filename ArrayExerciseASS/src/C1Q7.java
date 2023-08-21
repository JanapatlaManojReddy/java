//Sorting the elements
public class C1Q7 {

	public static void main(String[] args) {

		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		for(int m:arr)
		{
			System.out.print(m+" ");
		}
			System.out.println("\ndescending order");
		int temp =0;
		
		//descending order
		for(int x=0;x<arr.length;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]<arr[y])
				{
					temp = arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}			
			}
		}
		
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		//ascending order
		System.out.println("\nascending order");
		for(int x=0;x<arr.length;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					temp = arr[x];
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
