package oops.Polymorphism;

public class Polymorphism {
	
	//OVERLOADING
	public void print(int number) {
		System.out.println("Printing integer " + number); 
		
	}
	
	public void print(double number) {	//print method is used again.
		System.out.println("Printing double number " + number);
	}
	
	public void print(String text) {
		System.out.println("Printing the text " + text);
	}
	
	public static void main(String[] args) {
		Polymorphism datatype = new Polymorphism();
		datatype.print(10);
		datatype.print(15.5);
		datatype.print("Hathway");
		
		
	}
}
	
