package assignment_45;

import java.util.Scanner;

public class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of Employees:");
		int n= s.nextInt();
		Employee e[] = new Employee[n];
		System.out.println("Enter number of Products:");
		int a= s.nextInt();
		Product p[] = new Product[a];
		System.out.println("*****Employee*****");

		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].accept();
		}
		System.out.println("*****Products*****");
		for(int i=0;i<a;i++)
		{
			p[i]=new Product();
			p[i].accept();
		}
		
		for(int i=0;i<a;i++)
		{
			//e[i]=new Product();
			e[i].display();
			e[i].calcTax();
		}
		for(int i=0;i<a;i++)
		{
			//p[i]=new Product();
			p[i].display();
			p[i].calcTax();
		}
		
		s.close();
	}

}
