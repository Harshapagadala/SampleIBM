import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex1 {
	public static void main(String[] args) {
		
		ArrayList <String> Bikes = new ArrayList();
		
		LinkedList <Integer> age = new LinkedList();
		
		HashMap <String,String> Dept = new HashMap();
		
		HashSet<String> Names = new HashSet<String>();
		
		Bikes.add("Kawaski Ninja Z");
		Bikes.add("Hero Motocorp");
		Bikes.add("BMW 1000 r");
		Bikes.add("Ducati VR");
		
		Collections.sort(Bikes);				// Sort the bikes array with collections class.
		
		age.add(110);
		age.add(22);
		age.add(13);
		
		Collections.sort(age);

		Dept.put("Sowjanya" , "Finance");		//'PUT' Keyword is used in HashMap to add elements.
		Dept.put("Niharika", "SoftWare");
		Dept.put("Harshavardini", "HardWare");
		
		//Collections.sort(Dept);
		
		System.out.println(Bikes);
		
		System.out.println(age);
		
		System.out.println(Dept);
		
		//Looping
		
		for (String i : Bikes) {
			System.out.println(i);
			
		}
		
		for (int j : age) {
			System.out.println(age);
		}
		
		Dept.get("Sowjanya");
		
		// Operations on ArrayList
		
				Bikes.get(2);						// it fetches the element in the array with the index number.
				
				Bikes.set(1, "Hero Honda");			// it updates the element in the array.
				
				Bikes.remove(3);					//it removes the element in the array.
				
				//Bikes.clear();                   //- it clears the whole array
				
				System.out.println(Bikes);
		
		// HashSet 
		
		Names.add("Ram");
		Names.add("Shyam");
		Names.add("Vishnu");
		
		System.out.println(Names);
		
		//Get the iterator
		
		Iterator<String> obj = Bikes.iterator();
		
		// Print the first item
		
		System.out.println(obj.next());
		
		System.out.println(obj.hasNext());
	}
}
