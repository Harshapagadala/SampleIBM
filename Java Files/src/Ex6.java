import java.util.Scanner;

public class Ex6 {
	int x;
	int y;
	int c = x + y;
	String name;
	String Profession;
	public void add(int x, int y, String name) {
		this.c = x + y;
		System.out.println("The math operation: " + name);
		System.out.println("The addition of two numbers : " + c);
	}
	public void career(String name, String Profession) {
		/*this.name = "Musk";
		this.Profession = "Engineer";*/
		System.out.println("The name of the person :" + name);
		System.out.println("The profession of the person:" + Profession);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Today's work");
		Scanner job = new Scanner(System.in);
		Scanner relation = new Scanner (System.in);
		Ex6 add = new Ex6();
		Ex6 profile = new Ex6();
		add.add(10, 20, "Addition");
		profile.career("Musk", "Entrepreneur");
		int n = 10;
		printFibonnaci(n);
		
		String part = job.nextLine();		
		String brother = relation.nextLine();
		System.out.println("The second job the person has:" + part + "\nThe brother of Kimbal Musk: " + brother);
		
		
	}
	
	// Fibonacci Series (Iterative approach)
	
	public static void printFibonnaci(int n) {
		
		int a = 0, b = 1;
		
		System.out.println("Fibonnaci Series \n " + a);
		
		for(int i = 0; i < n ; i ++) {
			
			System.out.println(" " + b);
			
			int next = a + b;
			
			a = b;
			
			b = next;
		}
		
		System.out.println();
	}
	
	
	// Reverse a string 
	
	public static String reversestring(String str) {                 //refer line 40;
		
		StringBuilder sb = new StringBuilder();
		return sb.reverse().toString();
	}
	
	
}

