package exam;

public class BentoPattern {

	public static void main(String[] args) {
		  
		    
		    
			for(int x=1;x<5;x++)
			{
				
			    for(int y=4;y>x;y--)
			    {
			    	 System.out.print("   ");
			    }
			    for(int z=1;z<=((2*x)-1);z++)
			    {
			    if(x==4&&z==4)
				    System.out.print(0+"  ");	
			    if(z==1||z==(2*x)-1)
			         System.out.print(1+"  ");
			    
			    if(z==2||z==(2*x)-2) 
			    	System.out.print(4+"  ");
			    if(x==3&&z==3||z==3&&x==4||x==4&&z==5) {
			    	System.out.print(9+"  ");
			    	
			    }
			    	
			    
			    }
			            
			    
			    System.out.println();
			}
			    
			
			
			for(int x=3;x>0;x--)
			{
				int num=1;
			    for(int y=x;y<=3;y++)
			    {
			    	 System.out.print("   ");
			    }
			    for(int z=1;z<=((2*x)-1);z++)
			    {
			    	if(z==1||z==2*x-1)
					     System.out.print(1+"  ");
			    	if(z==2||z==2*x-2)
			    		 System.out.print(4+"  ");
			    	if(z==3&&x==3)
			    		System.out.print(9+"  ");
					   
			      }
			            
			    
			    System.out.println();
			}
			    	

	}

}
