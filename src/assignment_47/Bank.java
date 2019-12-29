package assignment_47;

public abstract class Bank {
	
	int accountNumber;
	String name,branch;
	float balance;
	public abstract float getDetails();
	public abstract void updateBalance(float bal,int c);
	
	
	public Bank() {
		
	}
	public Bank(int accountNumber, String name, String branch, float balance) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.branch = branch;
		this.balance = balance;
	} 
	
	
}
