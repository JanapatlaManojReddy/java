package conditionalStatements;

public class Vowels {
	public static void main(String[] args) {
		char ch = 'a';
		if(ch>=65&&ch<=90) {
			if(ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I') {
				System.out.println("upper case vowel");
			}else {
				System.out.println("consonent");
			}
		}
		else 
			if(ch>=97&&ch<=122) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					System.out.println("lower vowels");
			}else {
				System.out.println("lower consonent");
			
		}
		}
		
	}

}
