
class Chef implements Runnable{
	
	private String dish;

	public Chef(String dish) {
		super();
		this.dish = dish;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Chef is preparing :" + dish);
	 try {
		Thread.sleep(10000);  // Simulate time taken to prepare the dish
	}
	 catch(InterruptedException e) {
		 e.printStackTrace();
	 }
	 
	 System.out.println(dish + " is ready!!");
	
}
public class Ex3Thread {
	public static void main(String[] args) {
		Thread chef1 = new Thread(new Chef("IDLI"));
		Thread chef2 = new Thread(new Chef("VADA"));
		Thread chef3 = new Thread(new Chef("DOSA"));
		
		chef1.start();
		chef2.start();
		chef3.start();
	}
}


	private int Salary;

	public Chef(int salary) {
		super();
		this.Salary = salary;
	}
	
	
}
