
public class C1Q5AB {

	public static void main(String[] args) {
		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		for(int m:arr)
		{
			System.out.print(m+" ");
		}
		System.out.println();
		//printing the array in the reverse order
		System.out.println("the reverse order of the array is");
		for(int x=arr.length-1;x>=0;x--)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		//dividing the array into two equal parts
		int div=(arr.length-1)/2;
		System.out.println("printing the first in the reverse order and then printing the whole array");
		for(int x=(arr.length-1)/2;x>=0;x--)
		{
			System.out.print(arr[x]+" ");
		}
		for(int x=(((arr.length-1)/2)+1);x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		//first half same second half in reverse
		System.out.println("printong the second half in the revese order and printing the whole array");
		for(int x=0;x<(arr.length)/2;x++)
		{
			System.out.print(arr[x]+" ");
		}
		for(int x=(arr.length-1);x>=(arr.length)/2;x--)
		{
			System.out.print(arr[x]+" ");
		}
		
	}

}
