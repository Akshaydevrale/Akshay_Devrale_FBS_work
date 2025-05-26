package polymorphism;

class vehicle{
	int id;
	String brand;
	double price;
	
	vehicle(){
		this.id=738;
		this.brand="Not given";
		this.price=1000;
	}
	vehicle(int id, String brand, double price) {
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void display() {
		System.out.println("Vehicle Id: "+id);
		System.out.println("Vehicle Brand: "+brand);
		System.out.println("Vehicle Price"+price);
	}
}//super class vehicle ends here

class car extends vehicle{
	int noofAirbags;
	String sunrooftype;
	String drivemode;
	
	car(){
		this.noofAirbags=1;
		this.sunrooftype="Not given";
		this.drivemode="Not given";
	}
	car(int id,String brand,int price,int noofAirbags, String sunrooftype, String drivemode) {
		super(id,brand,price);
		this.noofAirbags = noofAirbags;
		this.sunrooftype = sunrooftype;
		this.drivemode = drivemode;
	}
	int getNoofAirbags() {
		return noofAirbags;
	}
	void setNoofAirbags(int noofAirbags) {
		this.noofAirbags = noofAirbags;
	}
	String getSunrooftype() {
		return sunrooftype;
	}
	void setSunrooftype(String sunrooftype) {
		this.sunrooftype = sunrooftype;
	}
	String getDrivemode() {
		return drivemode;
	}
	void setDrivemode(String drivemode) {
		this.drivemode = drivemode;
	}
	void display() {
		super.display();
		System.out.println("No of airbags of car: "+noofAirbags);
		System.out.println("Sunroof type: "+sunrooftype);
		System.out.println("Drive mode: "+drivemode);
	}
}//class car ends here

class bike extends vehicle{
	String startmechanism;
	String extraswitch;
	
	bike(){
		this.startmechanism="Not given";
		this.extraswitch="Not given";
	}
	bike(int id,String brand,int price,String startmechanism, String extraswitch) {
		super(id,brand,price);
		this.startmechanism = startmechanism;
		this.extraswitch = extraswitch;
	}
	String getStartmechanism() {
		return startmechanism;
	}
	void setStartmechanism(String startmechanism) {
		this.startmechanism = startmechanism;
	}
	String getExtraswitch() {
		return extraswitch;
	}
	void setExtraswitch(String extraswitch) {
		this.extraswitch = extraswitch;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Start mechanism: "+startmechanism);
		System.out.println("Extra Switch: "+extraswitch);
	}
	
}//class bike ends here

class bus extends vehicle{
	int standingcapacity;
	int doors;
	String ticketsystem;
	
	bus(){
		this.standingcapacity=10;
		this.doors=2;
		this.ticketsystem="Not given";
	}
	bus(int id,String brand,int price,int standingcapacity, int doors, String ticketsystem) {
		super(id,brand,price);
		this.standingcapacity = standingcapacity;
		this.doors = doors;
		this.ticketsystem = ticketsystem;
	}
	int getStandingcapacity() {
		return standingcapacity;
	}
	void setStandingcapacity(int standingcapacity) {
		this.standingcapacity = standingcapacity;
	}
	int getDoors() {
		return doors;
	}
	void setDoors(int doors) {
		this.doors = doors;
	}
	String getTicketsystem() {
		return ticketsystem;
	}
	void setTicketsystem(String ticketsystem) {
		this.ticketsystem = ticketsystem;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Standing passengers capacity: "+standingcapacity);
		System.out.println("No of Doors: "+doors);
		System.out.println("Ticket system: "+ticketsystem);
	}
}//class bus ends here

public class Test4 {

	public static void main(String[] args) {
		
		vehicle v1;
		v1=new car(44,"Supra",37388888,4,"Panaromic","Sports");
		v1.display();
		
		v1=new bike(4448,"Bajaj",150000,"kickstart","Kill switch");
		v1.display();
		
		v1=new bus(10,"Tata",4000000,45,4,"Online");
		v1.display();

	}

}
