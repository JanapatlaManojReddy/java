package TwoDimenstionalArray;

public class TwoDarray {
	public static void main(String args[]) {

	TwoDarray.quiz(4);	
}
static void quiz(int n)
{
    if(n==1){
    	return;
    }
    System.out.println(n+1);
    quiz(n-1);
    //System.out.println(n=n+1);
}
}