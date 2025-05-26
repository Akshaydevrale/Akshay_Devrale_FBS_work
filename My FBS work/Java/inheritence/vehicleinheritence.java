package inheritence;

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
		super.display();
		System.out.println("Standing passengers capacity: "+standingcapacity);
		System.out.println("No of Doors: "+doors);
		System.out.println("Ticket system: "+ticketsystem);
	}
}//class bus ends here

public class vehicleinheritence {

	public static void main(String[] args) {
		car c1=new car();
		c1.setId(239392);
		c1.setBrand("Tata");
		c1.setPrice(2200000);
		c1.setNoofAirbags(4);
		c1.setSunrooftype("Panaromic");
		c1.setDrivemode("Sports");
		c1.display();
		
		bike b1=new bike();
		b1.setId(23323);
		b1.setBrand("Baja");
		b1.setPrice(200000);
		b1.setStartmechanism("Kick Start");
		b1.setExtraswitch("Kill switch");
		b1.display();
		
		bus b2=new bus();
		b2.setId(2343);
		b2.setBrand("Volvo");
		b2.setPrice(4400000);
		b2.setStandingcapacity(40);
		b2.setDoors(5);
		b2.setTicketsystem("Online");
		b2.display();
		
	}

}
