package arrayOfObjects;

class Player {
	int jerseyNo;
	String name;
	int runs;
	
	Player(){
		this.jerseyNo=1;
		this.name="Not given";
		this.runs=100;
	}
	Player(int jerseyNo,String name,int runs){
		this.jerseyNo=jerseyNo;
		this.name=name;
		this.runs=runs;
	}
	int getJerseyNo() {
		return jerseyNo;
	}
	void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getRuns() {
		return runs;
	}
	void setRuns(int runs) {
		this.runs = runs;
	}
	void display() {
		System.out.println("Jersey No: "+jerseyNo);
		System.out.println("Name: "+name);
		System.out.println("Runs: "+runs);
	}
} //class player ends here

public class TestPlayer {
	public static void main(String[] args) {
		Player[] arrP=new Player[3];
		arrP[0]=new Player(10,"Sachin",28000);
		arrP[1]=new Player(45,"Rohit",18000);
		arrP[2]=new Player(18,"Virat",24000);
	  //arrP[3]=new Player(7,"Msd",8000);  //Array index out of bound
		
		for(int i=0;i<arrP.length;i++) {
			arrP[i].display();
			System.out.println();
		}
	}
	
}
