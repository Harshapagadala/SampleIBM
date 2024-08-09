
public class attributes {
	
		int a;
		static int x;
		static int y;
		int c = x + y;
		
	public static void main(String[] args) {
		attributes obj = new attributes();
		//add Add = new add();
		obj.a = 20;
		obj.x = 25;
		obj.y = 35;
		obj.c = x+y;
		System.out.println(obj.a);
		System.out.println("The result of two values is :" + obj.c);	

	}
	
}


