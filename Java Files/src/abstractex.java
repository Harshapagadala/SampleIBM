
public abstract class abstractex {
	
	public void name(){
	System.out.println("Ram"); }
	public void course() {
		System.out.println("Bachelor of technology");
	}
	
	public static void main(String[] args){
		 
		 student obj = new student();
		 obj.name();
		 obj.department();
		 obj.course();
		 System.out.println("The description of the student details");
	}
	
}
	
	/*public abstract void name() ;
	
	public void profession() {
		
		System.out.println("Engineering");
	}

	public static void main(String[] args) {
		student obj = new student();
		obj.profession();
		obj.name();
	}
}
 
class student extends abstractex {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("In final year");
		
	}
	*/

class student extends abstractex{

  public void department(){
  System.out.println("is in Engineering");
  System.out.println("In final year");
  
  }
  
}