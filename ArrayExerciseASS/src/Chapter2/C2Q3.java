package Chapter2;

public class C2Q3 {

	public static void main(String[] args) {
		int a[]=new int[] {12,56,34,23,67,76,32,88,90,345};
		int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			b[x]=a[x];
		}
		for(int x=0;x<b.length;x++)
		{
			if(x%2==0)
			System.out.print(b[x]+" ");
		}

	}

}
