
public class C1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,i=0,s=0,b=0;
		char ch[] = new char[] {'c','1','%','a'};
		for(int n:ch)
			c++;
		String st[]=new String[] {"hello","all","good","morning"};
		for(String m:st)
		{
			s++;
		}
			
		boolean b1[]= new boolean[] {true,false,true,true,true,false};
		for(boolean e :b1 ) {
			b++;
		}
		int arr[]=new int[] {1,3,5,7,8};
		for(int nn:arr)
		{
			i++;
		}
		System.out.println("length of char array ="+c);
		System.out.println("length of String array ="+s);
		System.out.println("length of  boolean array ="+b);
		System.out.println("length of int  array ="+i);


	}

}
