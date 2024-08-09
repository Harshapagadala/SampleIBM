
public class Ex2 {

	public static void main(String[] args) {
	
		
		/*//Try this program
		int [] myNumbers = {1,2,3};
		System.out.println(myNumbers[10]);
 	}*/
		//Instead
		try {
			int [] myNumber = {1,2,3};
			System.out.println(myNumber[10]);
		}
		catch (Exception e) {   
			System.out.println("Something went wrong");				//Instead of error it throws this output.
		}
		
		finally {
			System.out.println("An exception error is occured.");
		}
		
	}
}
		

