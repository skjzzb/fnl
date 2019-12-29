package assignment_32;

import java.util.Scanner;

public class MathOperation {
	public int mul(int a,int b)
	{
		int r;
		r = a*b;
		return r;
	}
	public float mul(float f1,float f2,float f3)
	{
		float r;
		r= f1*f2*f3;
		return r;
	}
	public int mul(int arr[])
	{
		int rr = 1;
		for(int i:arr)
		{
			rr=rr*i; 
		}
		return rr;
	}
	public double mul(double d,int l)
	{
		double r;
		r = d*l;
		return r;
	}
	public static void main(String[] args) {

		MathOperation m =new MathOperation();
		Scanner s= new Scanner(System.in);
		
		while(true)
		{
		System.out.println(" 1.Two integers \n 2.Three floats\n 3.All elements of array\n 4.one double & one integer\n 5.Exit");
		int ch=s.nextInt();	
	
		switch (ch) {
		case 1:	System.out.println("Enter two integers");
				int a=s.nextInt();
				int b=s.nextInt();
				System.out.println(m.mul(a,b));
				break;
		case 2: 	System.out.println("Enter three float");
					float f1=s.nextFloat();
					float f2=s.nextFloat();
					float f3=s.nextFloat();
					System.out.println(m.mul(f1,f2,f3));
					break;
		case 3:System.out.println("Enter size of array");
				int p=s.nextInt();
				int arr[] = new int[p];
				for(int i=0;i<p;i++)
				{
					arr[i]=s.nextInt();
				}
				System.out.println(m.mul(arr));
				break;
		case 4: System.out.println("Enter one double & one integer");
				double d=s.nextDouble();
				int l=s.nextInt();
				System.out.println(m.mul(d,l));
				break;
		case 5:	s.close();
				return;
		default:
				System.out.println("wrong input");
			break;
		}
	
		}
		
		
	}

}
