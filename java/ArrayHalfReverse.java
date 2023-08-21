import java.util.*;
public class ArrayHalfReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length of the array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		int rev[]=new int [arr.length];
		int copy[]=new int [arr.length];
		System.out.println("enter the array elements");
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=sc.nextInt();
		}
		for(int x=(arr.length-1)/2,y=0;x>=0;x--,y++)
		{
			rev[y]=arr[x];
		}
		for(int x=(arr.length-1),y=((arr.length-1)/2)+1;x>(arr.length-1)/2;x--,y++)
		{
			rev[y]=arr[x];
		}
		for(int x=0;x<rev.length;x++)
		{
			System.out.println(rev[x]+" ");
		}
	}

}
