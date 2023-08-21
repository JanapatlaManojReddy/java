//multiplication of array elements
import java.util.*;
public class ArrayM {

	public static void main(String[] args) {
		int mul =1;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a length of the array");
	int size = sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter the array elements");
	for(int x=0;x<arr.length;x++)
	{
		arr[x]=sc.nextInt();
	}
	for(int x=0;x<arr.length;x++)
	{
		mul=mul*arr[x];
	}
	System.out.println(mul);
	}

}
