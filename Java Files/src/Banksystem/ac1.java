package Banksystem;

public class ac1 {
	
	public static void main(String[] args) {
		System.out.println("Please select the type of bank account:");
			String sac = "Savings account";
			String cac = "Current account";
			if (sac.equals(cac)) {
				System.out.println("Your account balance:");
				System.out.println("Previous transactions: ");
			}else {
				System.out.println("Please select a proper bank account");
			}
		}
}

