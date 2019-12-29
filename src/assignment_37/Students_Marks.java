 package assignment_37;

import java.util.Scanner;

// 37.  Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50],[50-65],[65-80],[80-100]. 
public class Students_Marks {
	int rollNo;
	int age;
	int score;
	protected Scanner ss=new Scanner(System.in);
	public void accept()
	{
		
		System.out.println("Enter The Student Details\n 1 --> Roll_No \n 2--> Age \n 3--> Score");
		rollNo=ss.nextInt();
		age=ss.nextInt();
		score=ss.nextInt();
		
		
	}
	public void check (Students_Marks st[])
	{
		System.out.println("The student score is in range 0-50  ");
		for(int i=0;i<5;i++)
		{
			Students_Marks cc= new Students_Marks();
			cc=st[i];
			if(cc.score>0 && cc.score<51)
			{
				
				System.out.println(cc);
				System.out.println();
			}
			 else
			 {
				 System.out.println("Nothing found");
			 }
		}
		System.out.println("The student score is in range 50-65  ");
		for(int i=0;i<5;i++)
		{
			Students_Marks cc= new Students_Marks();
			cc=st[i];
			 if(cc.score>50 && cc.score<66)
			{
				
				System.out.println(cc);
				System.out.println();
			}
			 else
			 {
				 System.out.println("Nothing found");
			 }
		}
		System.out.println("The student score is in range 65-80  ");
		for(int i=0;i<5;i++)
		{
			Students_Marks cc= new Students_Marks();
			cc=st[i];
			 if(cc.score>65 && cc.score<81)
			{
				
				System.out.println(cc);
				System.out.println();
			}
			 else
			 {
				 System.out.println("Nothing found");
			 }
		}
		System.out.println("The student score is in range 80-100  ");
		for(int i=0;i<5;i++)
		{
			Students_Marks cc= new Students_Marks();
			cc=st[i];
			 if(cc.score>80 && cc.score<101)
			{
				
				System.out.println(cc);
				System.out.println();
			}
			 else
			 {
				 System.out.println("Nothing found");
			 }
		}
		
	}
	

	@Override
	public String toString() {
		return "Students_Marks [rollNo=" + rollNo + ", age=" + age + ", score=" + score + "]";
	}
	public static void main(String[] args) {
		Students_Marks sm[]= new Students_Marks[5];
		
		for(int i=0;i<5;i++)
		{
			sm[i]=new Students_Marks();
			sm[i].accept();
			
		}
		Students_Marks c= new Students_Marks();
		c.check(sm);
		
		
		System.out.println("All students");
		for(int i=0;i<5;i++)
		{
		
			System.out.println(sm[i]);
			
		}
		
		
		

	}

}
