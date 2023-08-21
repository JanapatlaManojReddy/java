 class Upper{
    public static void main(String args[])
          {
         char ch= 'a';
         if(ch>='A'&&ch<='Z')
             System.out.println("upper case letter");
         else if(ch>='a'&&ch<='z')
             System.out.println("lower case letter");
         else
		 System.out.println("special charecter");
        }
}
   

class Upper2
{
     public static void main(String args[])
	{
         char ch ='a';
         if(ch>='A'&&ch<='Z')
               {
               if(ch<='P')
                      System.out.println("upper case untill P");
                   else
			         System.out.println("upper case from Q to Z");
   	  	 	    }
           else
			System.out.println("lower case letter untill z"); 
      }
}