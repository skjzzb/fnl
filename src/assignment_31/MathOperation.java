package assignment_31;

import java.util.Scanner;

public class MathOperation {
	
	int x,y,r;
	Scanner s= new Scanner(System.in);
	public MathOperation() {
		this.x = 1;
		this.y = 1;
		this.r = 2;
	}
	
	public void init()
	{
		System.out.println("Enter the value for X and Y ");
		 
		x=s.nextInt();
		y=s.nextInt();
		//s.close();
		System.out.println("value of X "+x +" and Y "+y);

		
	}

	public String toString() {
		return "MathOperation [result= " + r + "]";
	}
	public int add()
	{
		r = x+y;
		return r;
	}
	public int mul()
	{
		r = x*y;
		return r;
	}
	public double power()
	{
		double result = Math.pow(x, y);
		return result;
	}
	public static void main(String[] args) {

		MathOperation m =new MathOperation();
		
		Scanner s= new Scanner(System.in);
		int ch;
		
		m.init();
		
		while(true)
		{
		System.out.println(" 1.Add \n 2.Multiply\n 3.Power\n 4.Display\n 5.Exit");
		System.out.println("enter your choice");
		ch=s.nextInt();	
		
		switch (ch) {
		case 1:	m.add();			
			break;
		case 2: m.mul();
				break;
		case 3:m.power();
				break;
		case 4: System.out.println(m);
				break;
		case 5: s.close();
		break;
		default:
				System.out.println("wrong input");
			break;
		}
		
		}
		
		
	}
	
}
