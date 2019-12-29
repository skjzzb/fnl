package assignment_45;

import java.util.Scanner;

public class Product implements Taxable {
	int pid;
	float price;
	int quantity;
	Scanner s = new Scanner(System.in);
	
	@Override
	public void calcTax() {
		float stax = (price *quantity) * salesTax/100; 
		float itax = (price *quantity) * incomeTax/100; 
		
		System.out.println("Salestax :"+stax+" \nIncometax :"+itax);
		System.out.println("Total Price+SalesTax : "+((price*quantity)+stax));
		System.out.println("Total Price+IncomeTax: "+((price*quantity)+itax));
	}
	public void accept()
	{
		System.out.println("Enter the Product details:\n pid \n price \n quantity");
		pid= s.nextInt();
		price=s.nextFloat();
		quantity=s.nextInt();
	}
	public void display()
	{
		System.out.println("Product details are:");
		System.out.println("Product Id: "+pid);
		System.out.println("Price     : "+price);
		
		System.out.println("Quantity  : "+quantity);
		
		
	}

}
