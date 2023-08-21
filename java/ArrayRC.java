//rotation and copying the elements in the same array by using left rotation
public class ArrayRC {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,30,40,50,60,70,80,90};
		int temp = arr[0];
		int x=0;
		for(x=0;x<arr.length-1;x++)
		{
			arr[x]=arr[x+1];
			System.out.print(arr[x]+" ");
		}
		System.out.println(arr[x]=temp);
	}

}
