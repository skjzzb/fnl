package assignment_35;

import java.util.Scanner;

/*
35. Create a class Employee  with(empNo ,salary and totalSalary) ) with following features.
a. Only parameterized constructor;
b. totalSalary always represent total of all the salaries of all employees created.
c. empNo should be auto incremented. 
d. display total employees and totalSalary using class method*/

public class Employee {
	
	static int empNo;
	double salary;
	static double totalSalary;
	int count;
	protected Scanner s=new Scanner(System.in);

	
	public Employee(double salary) {
		count=++Employee.empNo;
		this.salary=salary;
		Employee.totalSalary +=salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
		this.salary=00;
	}

	public static void totalSal()
	{
		System.out.println("Total salary: "+totalSalary );
	}
	public void accept()
	{
		
		System.out.println("Enter The Salary Of Employee");
		this.salary=s.nextDouble();
		Employee.totalSalary+=salary;
		
	}
	
	public void display(Employee e[])
	{
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
			
		}
		System.out.println("Total Amount of Employees "+ Employee.totalSalary);

		
		
	}

	public String toString() {
		return "Employee [Emp_No= "+count+" salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number of Employees");
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		Employee e[]= new Employee[n];
		Employee emp = new Employee();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter The Salary Of Employee");
			double sal=s.nextDouble();
			e[i] =new Employee(sal);
					//e[i].accept();
		}
		
		emp.display(e);
		s.close();
		
		
		
	}

}