
public class Exstr {
	public static void main(String[] args) {
		
		String myString = "Hello world";
		String myString1 = "I am a Robot";
		String x = "11";
		int y = 22;
		String z = x + y;
		
		System.out.println(myString);
		
		System.out.println("The text length is :" + myString.length());
		
		System.out.println(myString.toLowerCase()); // to convert the entire text to lowercase
		
		System.out.println(myString.toUpperCase()); // to convert the entire text to UPPERCASE
		
		System.out.println(myString.indexOf("world")); // to locate the index in a text of a string.
		
		System.out.println(myString + " " + myString1); // concatenation.
		
		System.out.println(myString.concat (myString1)); // concat keyword can be used.
		
		System.out.println(z);

	}
}
