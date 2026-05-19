package wrapperClasses;

public class StringToDouble {

	public static void main(String[] args) {
		String s1="10.5";
		String s2="10";
		
		double a=Double.parseDouble(s1);
		double b=Double.parseDouble(s2);
		
		double c=a+b;
		
		System.out.println("Division is:"+c);
	}

}
