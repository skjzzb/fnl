package assignment_47;

import java.util.Scanner;

public class Current extends Bank {
	Scanner s=new Scanner(System.in);

	public Current(int accountNumber, String name, String branch, float balance) {
		super(accountNumber, name, branch, balance);
		// TODO Auto-generated constructor stub
	}

	public Current() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getDetails() {
		
		return balance;
	}

	@Override
	public void updateBalance(float bal,int c) {
		// TODO Auto-generated method stub
		float temp=balance;
		temp=temp-bal;
		if(c==1)
		{
			balance+=bal;
		}
		else if(c==2)
		{
			if(balance<bal)
			{
				System.out.println("The Avilable Balance Is Not Sufficient ");
			}
			else if(balance>bal && temp>=1000)
			{
				balance-=bal;
			}
			else if(balance>bal && temp<=1000)
			{
				System.out.println("The Avilable Balance Is Not Satisfied With Minmum Bal ");
			}
		}
		
		
	}
	public String toString() {
		return "Current Account details \n["+"accountNumber=" + accountNumber + "\nname=" + name + "\nbranch=" + branch + "\nbalance="
				+ balance + "]";
	}
	public void accept()
	{
		System.out.println("Enter Account No.\nName\nBranch\nMinimum Balance Rs.1000");
		accountNumber=s.nextInt();
		name=s.next();
		branch=s.next();
		float temp=s.nextFloat();
		if(temp>=1000)
		{
			balance=temp;	
		}
		else
		{
			System.out.println("The minimum balance required is Rs.1000");
			System.out.println("Please Re-enter amount");
			balance=s.nextFloat();
		}
	}
	
}
