package oops.Polymorphism;

class Livingbeing{
	
	public void sound() {
		System.out.println("The Animal uses sound as their communication.");
	}	
}

class Cat extends Livingbeing {
	
	public void sound() {				//Overriding with the same method 'sound'
		System.out.println("The cat makes sound as 'MEOW' ");
	}
}

class Dog1 extends Cat{
	public void sound() {
		System.out.println("The Dog makes sound : 'Bow Bow'");
	}
	
}
public class overriding {
	public static void main(String[] args) {
		Livingbeing animal = new Livingbeing();
		Cat mycat = new Cat();
		Dog1 mydog = new Dog1();
		animal.sound();
		mycat.sound();
		mydog.sound();
		
		
	}

}
