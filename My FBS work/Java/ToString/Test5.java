package ToString;

class Vehicle{
	int id;
	String brand;
	double price;
	String brakesys;
	
	Vehicle(){
		this.id=738;
		this.brand="Not given";
		this.price=1000;
		this.brakesys="not given";
	}
	Vehicle(int id, String brand, double price,String brakesys) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.brakesys=brakesys;
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
	String getBrakesys() {
		return brakesys;
	}
	void setBrakesys(String brakesys) {
		this.brakesys=brakesys;
	}
	@Override
	public String toString() {
		return "Id:" + id + "  Brand:" + brand + "  Price:" + price + "  Brake System:"+brakesys;
	}
	
}//super class vehicle ends here

class Car extends Vehicle{
	int noofAirbags;
	String sunrooftype;
	String drivemode;
	
	Car(){
		this.noofAirbags=1;
		this.sunrooftype="Not given";
		this.drivemode="Not given";
	}
	Car(int id,String brand,int price,String brakesys,int noofAirbags, String sunrooftype, String drivemode) {
		super(id,brand,price,brakesys);
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
	@Override
	public String toString() {
		System.out.println("Car details:");
		return super.toString()+"  NoofAirbags:" + noofAirbags + "  Sunrooftype:" + sunrooftype + "  Drivemode:" + drivemode;
	}
	
}//class car ends here

class Bike extends Vehicle{
	String startmechanism;
	String extraswitch;
	
	Bike(){
		this.startmechanism="Not given";
		this.extraswitch="Not given";
	}
	Bike(int id,String brand,int price,String brakesys,String startmechanism, String extraswitch) {
		super(id,brand,price,brakesys);
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
	@Override
	public String toString() {
		System.out.println("Bike details:");
		return super.toString()+"  Startmechanism=" + startmechanism + "  Extraswitch=" + extraswitch;
	}

	
}//class bike ends here

class Bus extends Vehicle{
	int standingcapacity;
	int doors;
	String ticketsystem;
	
	Bus(){
		this.standingcapacity=10;
		this.doors=2;
		this.ticketsystem="Not given";
	}
	Bus(int id,String brand,int price,String brakesys,int standingcapacity, int doors, String ticketsystem) {
		super(id,brand,price,brakesys);
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
	@Override
	public String toString() {
		System.out.println("Bus details:");
		return super.toString()+"  Standingcapacity:" + standingcapacity + "  Doors=" + doors + "  Ticketsystem=" + ticketsystem;
	}
	
}//class bus ends here

public class Test5 {

	public static void main(String[] args) {
		Vehicle v1;
		v1=new Car(33,"Tata",450000,"Hydrolic brake",4,"Panaromic","Sports");
		System.out.println(v1);
		
		v1=new Bike(44,"Bajaj",150000,"Disk brake","Powerswitch","Kill button");
		System.out.println(v1);
		
		v1=new Bus(55,"Volvo",8000000,"Air brake",40,4,"Online");
		System.out.println(v1);

	}

}

