import java.util.HashSet;
import java.util.Iterator;

public class Ex5 {
	
	public static void main(String[] args) {
		HashSet<String> bikes = new HashSet<String>();
		
		Ex5 obj1 = new Ex5();
		
		bikes.add("Kawaski Ninja");
		bikes.add("Hero Motocorp");
		bikes.add("BMW 1000 r");
		bikes.add("Ducati VR");
		
		System.out.println(bikes);
		
		Iterator<String> Sport = bikes.iterator();
		
		System.out.println(Sport.next());
		System.out.println(Sport.hasNext());
	}
}
