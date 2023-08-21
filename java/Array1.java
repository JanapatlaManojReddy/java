
public class Array1 {

	public static void main(String[] args) {
       int x,y;
	   int arr[]=new int[] {1,2,3,7,9};
       int copy[]=new int[arr.length];
       for(x=arr.length-1,y=0;y<arr.length;y++,x--) {
    	   copy[y]=arr[x];
    			   System.out.println(copy[y]);
       }
    	   
	}     

}
