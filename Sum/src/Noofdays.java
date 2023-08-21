class Noofdays
{
	public static void main(String args[])
	{
		int num=31;
		switch(num)
		{
			case 31: System.out.println("march" + "\n may" + "\n july" + "\n august" +" \n october" +"\n december");
					break;
			case 30: System.out.println(" april \n june \n september \n november ");
					break;
			case 28: System.out.println(" february");
					break;
			default: System.out.println(" invalid");
		}
	}
}