
public class Callmethod {
	static void myMethod(String fname){  // Parameters.
		System.out.println("This program is used to call a method.");
		System.out.println(fname + "Khan");
		int x = 45;
		int y = 55;
		int c = x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		System.out.println("Describing the code.");
		myMethod("Gauri");
		myMethod("Suhana");
		myMethod("Abraham");
		
		
	}
}
