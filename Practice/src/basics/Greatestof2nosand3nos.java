package basics;

public class Greatestof2nosand3nos {

	public static void main(String[] args) {
	int a =30;
	int b=29;
	int c=25;
	if(a>b) {
		System.out.println(a+"is greatest");
	}else {
		System.out.println(b+"is greatest");
	}
	{
	System.out.println((a>b?a:b));
	System.out.println((a>b?a+"is greates":b+"is greatest"));
	}
	if(a>b) {
		if(a>c) {
			System.out.println(a+"is greater");
				}
		else 	{ 
			System.out.println(c+"is greater");
				}
			}
	else {
		if(b>c) {
			System.out.println(b+"is greater");
		}
		else {
			System.out.println(c+"is greater");
		}
	}
	if(a>b&&a>c) {
		System.out.println(a+"is greater");
	}
	else if(b>a&&b>c) {
		System.out.println(b+"is greater");
	}else {
		System.out.println(c+"is greater");
	}
	if(a>b&&a>c) {
		System.out.println(a+"is greater");}
		else {
			if(b>c&&b>a) 
				System.out.println(b+" is greater");
				else 
					System.out.println(c+"is greater");
		}
	System.out.println((a>b?(a>c?a:c):b>c?b:c));
	System.out.println(c>(a>b?a:b)?c:(a>b?a:b));
	}

	
	}


