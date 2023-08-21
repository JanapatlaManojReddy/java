class Month
{
	public static void main(String args[])
	{   
         int x= 2;
		int year=2000;
		if(x==1||x==3||x==5||x==7||x==8||x==10||x==12){
			System.out.println("31 days");
				}
		else if(x==4||x==6||x==9||x==11){
			System.out.println("30 days");}
		else{
				   if((year%4==0&&year%100!=0)||(year%400==0))
					System.out.println("leap year and having 29 days");
				   else
                              System.out.println("not a leap year and having 28 days");}
	}
}
			