class Scholarship
{
    public static void main(String args[])
		{
			String name = "manoj";
			int roll = 3,total=120,obtained=130;
			int scholarship=0;
			if(obtained>=100&&obtained<=110){
				scholarship = 1000;
				System.out.println("Section A scholership==" +scholarship);
			}
			else{
                if(obtained<100){
				scholarship = 500;
				System.out.println("Section B scholership==" +scholarship);}
				else 
				System.out.println("invalid marks");
			}
		
        }
}