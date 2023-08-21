
public class C1Q1B_C_D {

	public static void main(String[] args) {
		char ch[] = new char[] {'c','1','%','a'};
		String st[]=new String[] {"hello","all","good","morning"};
		boolean b[]= new boolean[] {true,false,true,true,true,false};
		System.out.println("character array");
		for(int x=0;x<ch.length;x++)
		{
			System.out.print(ch[x]+" ");
		}
		System.out.println();
		System.out.print("string array \n ");
		for(int x=0;x<st.length;x++)
		{
			System.out.print(st[x]+" ");
		}
		System.out.println();
		System.out.print("boolean array");
		System.out.println();
		for(int x=0;x<b.length;x++)
		{
			System.out.print(b[x]+" ");
		}
	}

}
