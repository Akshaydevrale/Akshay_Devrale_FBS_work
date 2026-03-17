package exceptionHandling;

public class ThrowManually {

	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			
			if(a<0 || b<0) {
				throw new IllegalStateException();
			} else {
				System.out.println("Division of 2 numbers is: "+(a/b));
			}
		}catch(IllegalStateException ise){
			System.out.println("Negative numbers not allowed");
		}catch(NumberFormatException nfe) {
			System.out.println("Provide number only.");
		}catch(ArithmeticException ae) {
			System.out.println("Dont give 0 as argument.");
		}catch(ArrayIndexOutOfBoundsException aibe) {
			System.out.println("Provide atleast 2 argument.");
		}
		catch(Exception e) {
			System.out.println("Something went wrong we will fix it soon.");
		}

	}

}
