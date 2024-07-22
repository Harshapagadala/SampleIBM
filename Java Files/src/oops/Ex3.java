package oops;

//INHERITANCE

//parent class

class Animal{
	
	void eat() {
		
		System.out.println("The animal is eating.");
	}
	
}

// subclass
class Dog extends Animal{
	
	void Bark() {
		System.out.println("The dog is barking");
	}
}

public class Ex3 {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat();
		myDog.Bark();
		System.out.println("This is the process of inheritance.");
	}

}
