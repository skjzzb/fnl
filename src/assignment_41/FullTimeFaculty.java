package assignment_41;

import java.util.Scanner;

public class FullTimeFaculty extends Faculty {
	float basic, allowance;
	Scanner s=new Scanner(System.in);
	
	public FullTimeFaculty(int facultyid, float salary, float basic, float allowance) {
		super(facultyid,salary);
		this.basic = basic;
		this.allowance = allowance;
	}
	public FullTimeFaculty() {
		// TODO Auto-generated constructor stub
	}
	public void accept()
	{
		System.out.println("Enter the details of FullTimeFaculty \n Facuty ID \n Basic \n Allowance");
		facultyid=s.nextInt();
		
		basic=s.nextFloat();
		allowance=s.nextFloat();
		salary=basic+allowance;
	}
	@Override
	public String toString() {
		return "FullTimeFaculty [basic=" + basic + ", allowance=" + allowance + ", facultyid=" + facultyid + ", salary="
				+ salary + "]";
	}

	public static void main(String[] args) {
		

	}

}
