import java.util.Scanner;

//sqr the even index and cube the odd index
public class ArraySC {

	public static void main(String[] args) {
		
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
			if(arr[x]%2==0)//even square
			{
				arr[x]=arr[x]*arr[x];
			}
			if(arr[x]%2!=0)///odd cube
			{
				arr[x]=(int)Math.pow(arr[x],3);
			}
			
		}
		for(int x =0;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}

}
