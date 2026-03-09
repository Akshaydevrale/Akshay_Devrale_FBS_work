package functions;

public class IsPalindrome {
	public static void main(String[] args) {
		Assignment1 a1=new Assignment1();
		
		int res=a1.isPalin(12321);
		if(res==a1.isPalin(12321)) {
			System.out.print("Number is palindrome");
		}else {
			System.out.print("Number is not palindrome");
		}
	}
}
