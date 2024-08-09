import java.util.Scanner;

public class Ex {
	
	// JAVA OUTPUT FORMATTING
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================");
		
		for (int i = 0; i<3; i++) {
			
			String str = sc.next();
			int i1 = sc.nextInt();
			
			System.out.printf("%-15s%03d%n",str, i1);
			
			//%-15s: Left-justifies the string in a 15-character wide space.

			//%03d: Formats the integer to be 3 digits wide, padding with leading zeroes if necessary
					
		}
		
		System.out.println("===================");
	}
	
	
}
