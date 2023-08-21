package InsertionRotaion;
//elements insertion in a array
import java.util.*;
public class ElementIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int arr[]=new int[size];
		int x=0;
		for( x=0;x<arr.length-1;x++)
			arr[x]=sc.nextInt();
		int index = 4;
		int element = 45;
		for( x=arr.length-1;x>index;x--)
		{
			arr[x]=arr[x-1];
		}
		arr[x]=element;
		for(x=0;x<arr.length;x++)
			System.out.println(arr[x]+" ");
		

	}

}
