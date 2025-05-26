package interfacedemo;

interface Product{
	void getDetails();
}
interface Racer{
	void race();
}
interface Transportable{
	void transport();
}

class Animal{
	String colour;
	double price;
	
	Animal(){
		this.colour="Red";
		this.price=90000;
	}
	Animal(String colour, double price) {
		this.colour = colour;
		this.price = price;
	}
	String getColour() {
		return colour;
	}
	void setColour(String colour) {
		this.colour=colour;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price=price;
	}
	@Override
	public String toString() {
		return "Colour:" + colour + "  Price:" + price;
	}

}//class Animal ends here

class Horse extends Animal implements Racer,Transportable{ //class can implements multiple interfaces
	 
	Horse(){
		super();
	}
	Horse(String colour, double price) {
		super(colour, price);
	}
	public void race() {
		System.out.println("Horse is racing...");
	}
	public void transport() {
		System.out.println("Horse is transporting...");
	}
	public String toString() {
		System.out.println("Horse:");
		return super.toString();
	}
	
}//class horse ends here

class Bull extends Animal implements Racer,Transportable{
	
	Bull(){
		super();
	}
	Bull(String colour, double price) {
		super(colour, price);
	}
	public void race() {
		System.out.println("Bull is racing...");
	}
	@Override
	public void transport() {
		System.out.println("Bull is transporting...");
	}
	@Override
	public String toString() {
		System.out.println();
		System.out.println("Bull:");
		return super.toString();
	}
		
}//class Bull ends here

class Buffalo extends Animal{
	
	Buffalo(){
		super();
	}
	Buffalo(String colour, double price) {
		super(colour, price);
	}
	public String toString() {
		System.out.println();
		System.out.println("Buffelo:");
		return super.toString();
	}
	
}//class Buffalo ends here

class Vehicle{
	int id;
	String name;
	double price;
	String brake;
	
	Vehicle(){
		this.id=0;
		this.name="Not given";
		this.price=0.0;
		this.brake="Not given";
	}
	Vehicle(int id,String name,double price,String brake){
		this.id=id;
		this.name=name;
		this.price=price;
		this.brake=brake;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	String getBrake() {
		return brake;
	}
	void setBrake(String brake) {
		this.brake = brake;
	}
	@Override
	public String toString() {
		return " Id:" + id + "  Name:" + name + "  Price:" + price + "  Brake:" + brake;
	}
	
}//class vehicle ends here

class Car extends Vehicle implements Racer,Transportable{
	int noofairbag;
	String drivemode;
	
	Car(){
		super();
		this.noofairbag=0;
		this.drivemode="Not given";
	}
	Car(int id,String name,double price,String brake,int noofairbag, String drivemode) {
		super(id,name,price,brake);
		this.noofairbag = noofairbag;
		this.drivemode = drivemode;
	}
	int getNoofairbag() {
		return noofairbag;
	}
	void setNoofairbag(int noofairbag) {
		this.noofairbag = noofairbag;
	}
	String getDrivemode() {
		return drivemode;
	}
	void setDrivemode(String drivemode) {
		this.drivemode = drivemode;
	}
	@Override
	public void race() {
		System.out.println("Car is Racer...");
	}
	@Override
	public void transport() {
		System.out.println("Car is transportable...");
	}
	public String toString() {
		return super.toString()+"  No of Airbag:" +noofairbag+ "  Drive Mode:"+drivemode;
	}
	
}//class car ends here

class Bike extends Vehicle implements Racer,Transportable{
	String startmechanism;
	
	Bike(){
		super();
		this.startmechanism="Not given";
	}
	Bike(int id,String name,double price,String brake,String startmechanism){
		super(id,name,price,brake);
		this.startmechanism=startmechanism;  
	}
	String getStartmechanism() {
		return startmechanism;
	}
	void setStartmechanism(String startmechanism) {
		this.startmechanism=startmechanism;
	}
	public void race() {
		System.out.println("Bike is Racing...");
	}
	@Override
	public void transport() {
		System.out.println("Bike is transportable...");		
	}
	public String toString() {
		return super.toString()+"  Startmechanism:"+startmechanism;
	}
	
}//class bike ends here

class Bus extends Vehicle implements Transportable{
	int noofdoors;
	
	Bus(){
		super();
		this.noofdoors=0;
	}
	Bus(int id, String name, double price, String brake,int noofdoors) {
		super(id, name, price, brake);
		this.noofdoors=noofdoors;
	}
	int getNoofdoors() {
		return noofdoors;
	}
	void setNoofdoors(int noofdoors) {
		this.noofdoors=noofdoors;
	}
	public void transport() {
		System.out.println("Bus is transportable...");
	}
	@Override
	public String toString() {
		return super.toString()+"  Noofdoors:" + noofdoors;
	}
}//class bus ends here

public class Test1 {

	public static void main(String[] args) {
		Animal a1;
		a1=new Horse("White",4500000);
		System.out.println(a1);
		Horse h1 = new Horse();
		h1.race();
		h1.transport();
		
	}

}
