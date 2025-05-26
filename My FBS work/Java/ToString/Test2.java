package ToString;

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
	@Override
	public String toString() {
		return "fbid:" + fbid + "  Name:" + name + "  Distance:" + distance;
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

	@Override
	public String toString() {
		return super.toString()+"  Company:" + company + "  Desginition:" + desginition;
	}

}// class Placestudent ends here 


public class Test2 {

	public static void main(String[] args) {
		Student s1;
		s1=new Placestudent(22,"Bosch",450,"Firstbit","Cleark");
		System.out.println(s1);
	}

}
