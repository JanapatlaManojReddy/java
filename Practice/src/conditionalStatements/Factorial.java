package conditionalStatements;

public class Factorial {

	/*public static void main(String[] args) {
	int num=4;
	int fact=1;
	for(int x=1;x<=num;x++) {
		fact=fact*x;
		
	}
		System.out.println(fact);
	}*/
	
	
	static int factor(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return(num*factor(num-1));
		}
		
	
	}
	public static void main(String[] args) {
		int num=4,fact=1;
		fact=factor(num);
		System.out.println(fact);
		
	}

}
