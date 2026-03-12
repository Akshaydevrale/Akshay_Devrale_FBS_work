package abstractKeyword;

abstract class Animal {
	String name;
	
	Animal(){
		this.name="Not given";
	}
	Animal(String name){
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	abstract void sound();
	
} //class Animale ends here

class Dog extends Animal {
	String breed;
	
	Dog(){
		breed="Not given";
	}
	Dog(String name,String breed) {
		super(name);
		this.breed=breed;
	}
	String getBreed() {
		return breed;
	}
	void setBreed(String breed) {
		this.breed = breed;
	}
	
	void sound() {
		System.out.println("Name is "+name+" and breed is "+breed+" and barks...");
	}
} // class Dog ends here

class Cat extends Animal {
	String eyeColor;
	
	Cat(){
		this.eyeColor="Not given";
	}
	Cat(String name,String eyeColor) {
		super(name);
		this.eyeColor=eyeColor;
	}
	String getEyeColor() {
		return eyeColor;
	}
	void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	void sound() {
		System.out.println("Name is "+name+" and Eye colour is "+eyeColor+" and Meows...");
	}
} //class Cat ends here

public class TestAnimal {
	public static void main(String[] args) {
		Dog d1=new Dog("Bruno","Labrador");
		d1.sound();
		System.out.println();
		Cat c1=new Cat("Kitty","Blue");
		c1.sound();
	}
}
