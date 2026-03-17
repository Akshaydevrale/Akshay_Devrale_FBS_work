package exceptionHandling;

public class TryCatchTest {

	public static void main(String[] args) {
		try {
			
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println("Division is: "+(a/b));
		
		}
		catch(ArithmeticException ae){
			System.out.println("Dont provide 0 as arguments.");
		}catch(ArrayIndexOutOfBoundsException aibe) {
			System.out.println("Please provide atleast 2 arguments.");
		}catch(NumberFormatException nfe) {
			System.out.println("Please provide numbers only.");
		}catch(Exception e) {
			System.out.println("something went wrong we will fix it soon...");
		}

	}

}
