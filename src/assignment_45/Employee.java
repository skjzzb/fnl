package assignment_45;

import java.util.Scanner;

public class Employee implements Taxable {
	int empId;
	String name;
	float salary;
	Scanner s=new Scanner(System.in);
	@Override
	public void calcTax() {
		float stax = salary * salesTax/100; 
		float itax = salary * incomeTax/100; 
		
		System.out.println("Salestax of Employee on Salary :"+stax+" \nIncometax :"+itax);
		System.out.println("Total salary+SalesTax : "+(salary+stax));
		System.out.println("Total salary+IncomeTax: "+(salary+itax));
	}
	public Employee() {
	
	}
	public void accept()
	{
		System.out.println("Enter the Employee details:\n EmpNo \n Name \n Salary");
		empId= s.nextInt();
		name=s.next();
		salary=s.nextFloat();
	}
	public void display()
	{
		System.out.println("Employee details are:");
		System.out.println("EmpNo     : "+empId);
		System.out.println("Name      : "+name);
		System.out.println("Salary    : "+salary);
		
		
	}
}
