package oops;

//ENCAPSULATION//

public class Ex2 {			//Consider the class as a Person.
	
	private String name;
	private int age;		//private keyword makes variable to access only within the string.
	
	// Public setter and getter methods
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		if(age > 0) {
		this.age = age;
		}

	}
}
