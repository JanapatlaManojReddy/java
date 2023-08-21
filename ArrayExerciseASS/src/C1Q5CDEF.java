
public class C1Q5CDEF {

	public static void main(String[] args) {
		int arr[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.println("printing only even index elements");
		for(int x=0;x<arr.length;x++)
		{
			if(x%2==0)
				System.out.print(arr[x]+" ");
		}
		
		System.out.println("\nprinting the odd index elements");
		for(int x=0;x<arr.length;x++)
		{
			if(x%2==1)
				System.out.print(arr[x]+" ");
		}
		
		System.out.println("\nelements divided by 4");
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]%4==0)
				System.out.print(arr[x]+" ");
		}
		
		System.out.println("\nindeces which are divisible by 3");
		for(int x=0;x<arr.length;x++)
		{
			if(x%3==0)
				System.out.print(x+" ");
		}

	}

}
