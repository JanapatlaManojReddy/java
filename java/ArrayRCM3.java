//right rotation methode 3 copying and storing in the same array
public class ArrayRCM3 {

	public static void main(String[] args) {
	int arr[]=new int[] {10,20,30,40};
	int temp=arr[arr.length-1];
	int x=arr.length-1;
	for(;x>0;x--)
	{
		arr[x]=arr[x-1];
		System.out.println(arr[x]+" ");
	}
	System.out.println(arr[x]=temp);

	}

}
