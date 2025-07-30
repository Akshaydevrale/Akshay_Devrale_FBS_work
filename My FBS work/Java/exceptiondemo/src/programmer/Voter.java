package programmer;

public class Voter {
	int age;

	public Voter(int a) {
		this.age = a;
	}

	public void validate() throws AgeException {

		if (this.age < 18) {
			throw new AgeException();
		} else {
			System.out.println("Eligible for voting");
		}
	}

}// class voter ends here
