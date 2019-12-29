package assignment_41;

import java.util.Scanner;

public class Xyz {

	public static void main(String[] args) {
		 FullTimeFaculty ff[]=new FullTimeFaculty[2];
		 
		 PartTimeFaculty pp[]=new PartTimeFaculty[2];
		 Scanner s=new Scanner(System.in);
		 for(int i=0;i<2;i++)
		 {
			 ff[i]=new FullTimeFaculty();
			 ff[i].accept();
		 }
		 for(int i=0;i<2;i++)
		 {
			 pp[i]=new PartTimeFaculty();
			 pp[i].accept();
		 }
		 for(int i=0;i<2;i++)
		 {
			 System.out.println(ff[i]);
		 }
		 for(int i=0;i<2;i++)
		 {
			 System.out.println(pp[i]);
		 }
		
		 s.close();
	}

}
