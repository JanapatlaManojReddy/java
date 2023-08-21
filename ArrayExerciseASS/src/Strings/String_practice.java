package Strings;

public class String_practice {

	public static void main(String[] args) {
		String s = new String("a100b122c123");
		char[]c=s.toCharArray();
		int num=0;
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='a'&&s.charAt(x)<='z')
			{
				num=0;
				for(int y=x+1;y<s.length();y++)
				{
				if(s.charAt(y)>='0'&&s.charAt(y)<='9')
					num=num*10+Character.getNumericValue(s.charAt(y));
				else
					break;
				}
				for(int z=0;z<num;z++)
					System.out.print(s.charAt(x));
		
			}
		}
	}
}


