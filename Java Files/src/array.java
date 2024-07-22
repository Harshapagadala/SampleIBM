
public class array {
	public static  void main(String[] args) {
		// An array storing different ages
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

		float avg, sum = 0;

		// Get the length of the array
		int length = ages.length;

		// Loop through the elements of the array
		for (int age : ages) {
		  sum += age;
		}

		// Calculate the average by dividing the sum by the length
		avg = sum / length;

		// Print the average
		System.out.println("The average age is: " + avg);
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		myNumbers[1][2] = 9;
		
		System.out.println(myNumbers[1][2]); // Outputs 7
}
}
