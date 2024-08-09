//import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		/* Example 1:
	
		 Scanner myobj = new Scanner(System.in);
		
		//LocalDateTime obj2 = LocalDateTime.now();  			To display current time and date.
		System.out.println("Enter the Name, age and Salary : ");
		
		//String input 
		
		String userName = myobj.nextLine();
		
		//Numerical input
		
		int age = myobj.nextInt();
		double salary = myobj.nextDouble();
		
		System.out.println("Name :" + userName);
		System.out.println("Age :" + age);
		System.out.println("Salary :" + salary);
		//System.out.println("CurrentDate and Time :" + obj2);
		
		
		Example 2:
		
		Scanner scanner = new Scanner(System.in);
		
		String myString = scanner.next();
		
		int id = scanner.nextInt();
		
		System.out.println("Name :" + myString);
		System.out.println("ID :" + id); */
		
		Scanner scanner = new Scanner(System.in); 
		
		// Scanner breaks input into tokens using delimiter pattern
		
		int a = scanner.nextInt();
		
		if ( a % 2 == 0) {
			
			if ( a > 2 && a < 5) {
				System.out.println("Little Kid");
			} else if (a > 6 && a < 20) {
				System.out.println("Small kid");
			}else {
				System.out.println("Teenager");
			}
		}
		
		else {
			System.out.println("Adult");
		}
		
		 
	}
	
	

}
