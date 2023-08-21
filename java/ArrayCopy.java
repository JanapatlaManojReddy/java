import java.util.Scanner;

public class ArrayCopy {
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length of the array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		int copy[]=new int [arr.length];
		System.out.println("enter the array elements");
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=sc.nextInt();
		}
	
		for(int x=arr.length-1,y=0;y<arr.length;x--,y++)
		{
			copy[y]=arr[x];
		}
		for(int x=0;x<copy.length;x++)
		{
			System.out.println(copy[x]+" ");
		}
	}
}

