
public class Ex7 implements Runnable {
	
		 public void run() {
			 
		 System.out.printf("%d",3);
		 }
		 public static void main(String[]args)throws InterruptedException {
		 
			 Thread thread = new Thread(new Ex7());
		
			 thread.start();
		
			 System.out.printf("%d",1);
		 
			 thread.join();
		
			 System.out.printf("%d",2);
		 }
		}
	
//	    public static void main(String[] args) {
//	    
//	        String original = "Hello, World!";
//	        String reversed = reverseString(original);
//	        System.out.println("Original: " + original);
//	        System.out.println("Reversed: " + reversed);
//	    }
//
//	    public static String reverseString(String str) {
//	        StringBuilder sb = new StringBuilder(str);
//	        return sb.reverse().toString();
//	    }
	    

