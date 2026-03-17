package exceptionHandling;

class Voter {
	int age;

	Voter(int a) {
		this.age = a;
	}

	public String toString() {
		return "Your Age is: " + this.age;
	}
} // class Voter ends here

class AgeException extends Exception {

	public String toString() {
		return "Not eligible for voting.";
	}
} // class AgeException ends here

public class ThrwAgeExcptn {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);

			if (a < 18) {
				throw new AgeException();
			} else {
				Voter v1 = new Voter(a);
				System.out.println(v1);
			}
		} catch (AgeException ae) {
			System.out.println(ae);
		} catch (NumberFormatException nfe) {
			System.out.println("Provide numbers only.");
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Provide 1 argument atleast.");
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}

	}

}
