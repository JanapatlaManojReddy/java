class Switch
{
	public static void main(String args[])
	{
		int number=67;
		int num1=20,num2=23,num3;
         if(num1<num2)
		{
			switch(number)
			{
			
			case 'a': num3=num1*num2;
				 	System.out.println("multiplication"+num3);
				 	break;
       		case 'Z': num3=num1+num2;
					 System.out.println("addition"+num3);
					 break;
			default :
					 System.out.println("out of switch");
					break;
		
			case 'C': num3=num1-num2;
					 System.out.println("subtraction"+num3);
                  	 if(num1<num2)
						System.out.println("you are getting a negative value");
					 else 
						System.out.println("you are getting a possitive value");
					 break;
			
			}
		}
		else{
				System.out.println("total condition is wrong");
		}
		
	}
}



