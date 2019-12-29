package assignment_47;

import java.util.Scanner;

public class Coustomer  {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Bank temp = null;
		
		System.out.println("Welcom To Bank OF Infoway");
		
		System.out.println("Choose The Account Type");
		System.out.println("1--> Saving Account");
		System.out.println("2--> Current Account");
		int c=s.nextInt();
		if(c==1)
		{
			System.out.println("Enter The Saving Account Details");
			Bank b=new Saving();
			if(b instanceof Saving)
			{
				((Saving) b).accept();
				System.out.println("Savings account created");
			}
			temp=b;
			
		}
		else if(c==2)
		{
			System.out.println("Enter The Current Account Details");
			Bank bb=new Current();
			if(bb instanceof Current)
			{
				((Current) bb).accept();
				System.out.println("Current account created");
			}
				
			temp=bb;
		}
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Account Details\n2.Total Balance\n3.Deposit\n4.Withdrawl\n5.Exit");
			int o=s.nextInt();
			switch (o) {
			case 1:
				System.out.println(temp);
				break;
			case 2:
				System.out.println(" The Total Balace is "+temp.getDetails());
				break;	
			case 3:
				System.out.println(" Enter The Mony To Be Deposited");
				float bal=s.nextFloat();
				temp.updateBalance(bal,1);
				break;
			case 4:
				System.out.println(" Enter The Mony To Be Withdrawl");
				float bal1=s.nextFloat();
				temp.updateBalance(bal1,2);			
				break;	
			case 5:
				s.close();return;
			default:
				break;
			}
		}
		
	}

}
