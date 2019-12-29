package assignment_41;

import java.util.Scanner;

public class PartTimeFaculty extends Faculty {
	float hour, rate;
	Scanner s=new Scanner(System.in);

	
	public PartTimeFaculty(int facultyid, float salary, float hour, float rate) {
		super(facultyid,salary);
		this.hour = hour;
		this.rate = rate;
	}
	public PartTimeFaculty() {
		salary=hour*rate;
		this.hour = 0;
		this.rate = 0;
	}
	public void accept()
	{
		System.out.println("Enter the details of FullTimeFaculty \n Facuty ID \n Basic \n Allowance");
		facultyid=s.nextInt();
		hour=s.nextFloat();
		rate=s.nextFloat();
		salary=hour*rate;
	}

	@Override
	public String toString() {
		return "PartTimeFaculty [hour=" + hour + ", rate=" + rate + ", facultyid=" + facultyid + ", salary=" + salary
				+ "]";
	}


	public static void main(String[] args) {
		

	}

}
