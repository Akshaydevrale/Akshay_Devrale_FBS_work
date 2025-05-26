package polymorphism;

class Student{
	int fbid;
	String name;
	int distance;
	
	Student(){
		this.fbid=45;
		this.name="not given";
		this.distance=400;
	}
	Student(int fbid,String name,int distance){
		this.fbid=fbid;
		this.name=name;
		this.distance=distance;
	}
	int getFbid() {
		return fbid;
	}
	void setFbid(int fbid) {
		this.fbid = fbid;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getDistance() {
		return distance;
	}
	void setDistance(int distance) {
		this.distance = distance;
	}
	void display() {
		System.out.println("Id:"+fbid);
		System.out.println("Name:"+name);
		System.out.println("Distance"+distance);
	}
}//student class ends here

class Placestudent extends Student//step 1
{
	String company;
	String desginition;
	
	Placestudent(){
		super();//step 2
		this.company="Not assign";
		this.desginition="Not given";
	}

	Placestudent(int fbid,String name,int distance,String company, String desginition) {
		super(fbid,name,distance);//step 3
		this.company = company;
		this.desginition = desginition;
	}
	
	String getCompany() {
		return company;
	}

	void setCompany(String company) {
		this.company = company;
	}

	String getDesginition() {
		return desginition;
	}

	void setDesginition(String desginition) {
		this.desginition = desginition;
	}

	void display() {
		super.display();//step 4
		System.out.println("company name:"+company);
		System.out.println("Designition:"+desginition);
	}
}// class Placestudent ends here 


public class Test1 {

	public static void main(String[] args) {
		Student s1;		//generic reference
		s1=new Placestudent(11,"tom",45566,"mi","coach");	//upcasting
		
		s1.display();
		
	}

}
