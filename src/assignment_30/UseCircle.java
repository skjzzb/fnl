package assignment_30;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UseCircle {

	public static void main(String[] args) {
		DecimalFormat df =new DecimalFormat("#.#");
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle");
		int r = s.nextInt();
		s.close();
		Circle c1 = new Circle();
		float f= c1.area(r);
		float ff = c1.circum(r);
		System.out.println("Area of circle " +df.format(f));
		System.out.println("Circumference of circle "+df.format(ff));

	}

}
