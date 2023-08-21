import java.util.*;

public class C1Q1A {

	public static void main(String[] args) {
		//compliletime insertion
		int arr[]= new int[] {8,6,4,3,2};
		System.out.println("compiletime insertion");
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		//runtime insertion
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size= sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("enter elements");
		for(int x =0;x<arr1.length;x++)
		{
			arr1[x]=sc.nextInt();
			
		}
		System.out.println();
		System.out.println("runtime output");
		for(int x=0;x<arr1.length;x++) 
		{
			System.out.print(+arr1[x]+" ");
		}
	}

}
