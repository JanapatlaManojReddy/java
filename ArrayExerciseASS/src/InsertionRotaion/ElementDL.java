package InsertionRotaion;
//elements deletion
public class ElementDL {

	public static void main(String[] args) {
		int arr[]=new int[] {12,34,65,755,233,44,54,33};
		int dl = 3;
		int x=0;
		int ele=0;
		ele=arr[dl];
		System.out.println("the element deleted "+ele+" ");
		for(x=dl;x<arr.length-1;x++)
		{
		    
			arr[x]=arr[x+1];
		}
		System.out.println(ele);
		for(x=0;x<arr.length-1;x++)
		{
			System.out.println(arr[x]+" ");
		}
		

	}

}
