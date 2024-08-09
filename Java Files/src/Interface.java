/*interface Animal {
	public void Animalname();
	public void sound();
	public static void breed() {
		System.out.println("The breed of the dog: Husky");
	}
}*/

class Dog {
	public void Animalname() {
		System.out.println("The name of the Animal is : Dog");
	}
	public void sound() {
		System.out.println("The animal makes sound : Bow Bow");
	}
	public void breed() {
		System.out.println("Husky");
	}
}
public interface Interface {
	public static void main(String[] args) {
		Dog obj = new Dog(); 
		obj.Animalname();
		obj.sound();
		obj.breed();
	}
}
