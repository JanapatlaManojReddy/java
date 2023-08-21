package basics;

public class Extraction {
	
	public static void main(String[] args) {
		int n = 121;
		int temp = n;
		 int sum=0;
		 int pro=1;
		 int rem=0;
		 int rev=0;
		 int max=0;
		 String s="";
		 System.out.println(n);
		 String res=cal( n, temp, sum, rem, rev,pro,max,s);
		 System.out.println(res);
	}
		public static String cal(int n,int temp,int sum,int rem,int rev,int pro,int max,String s) {
			int count=0;
			for(;n>0;n/=10) {
				count++;
				rem=n%10;
				rev=rev*10+rem;
				if(rev==temp) {
				 s= temp+" is palindrom";
				} 
				if(rem>max) {
					max=rem;
				 }
				 if(rem%2==0) {
					 sum=sum+rem; 
				 }
				 else {
					 pro=pro*rem;
				 }	 
				 
	 }
	 return+sum+" is sum of the even digits  " +"\n" + pro+" is product of odd numbers \n"+max+" is the largest digit\n"+s;
	 }
	 
	 
//	 if (rev==temp) {
//	 
//	 System.out.println(rev+" is a palindrom");
//	 System.out.println(sum+" is the sum of the digits of palindrom");
//	 System.out.println(count+" is the count of the digits in the given number");
//	 }
//	 else {
//		 System.out.println(sum+" sum of the digits of the given number");
//	     System.out.println(count+" is the count of the digits in the number");}
//
//	}
//
}
