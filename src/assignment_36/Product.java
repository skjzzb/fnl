package assignment_36;

import java.util.Scanner;

/*
36. Create class Product (pid, price, quantity) with parameterized constructor. 

Create a main function in different class (say XYZ) and perform following task:
a. Accept five product information from user and store in an array
b.  Find Pid of product with highest price.
c. Create method (with array of product’s object as argument) 
in XYZ class to calculate and return total amount spent on all
 products. 
  (amount spent on single product=price of product * quantity of
   product)

 */
public class Product {

	int pId,quantity;
	float price;
	protected Scanner s=new Scanner(System.in);
	public Product(int pId, int quantity, float price) {
		
		this.pId = pId;
		this.quantity = quantity;
		this.price = price*quantity;
	}
	public Product() {
		// TODO Auto-generated constructor stub
		this.pId = 00;
		this.quantity =00;
		this.price = 00;
	}
	public void accept()
	{
		System.out.println("Enter the Product details\n pid, quantity, price");
		pId=s.nextInt();
		quantity=s.nextInt();
		price=quantity*s.nextFloat();
		
		
		
	}
	
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", quantity=" + quantity + ", price * quantity=" + price + "]";
	}
	
	
	public void find (Product a[])
	{
		Product temp =new Product();
		 float max=0;
		 max=a[0].price;
		 for(int i=1;i<5;i++)
		 {
			 if(max<a[i].price)
			 {
				 max=a[i].price;
				 temp=a[i];
			 }
			 
		 }
		 System.out.println("The Higest Prise Product Is -- > "+ temp);
	}
	public static void main(String[] args) {
		
		

	}

}
