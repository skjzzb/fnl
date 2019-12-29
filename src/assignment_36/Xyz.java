package assignment_36;

public class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product a[]=new Product[5];
		
		for(int i=0;i<5;i++)
		{
			a[i]=new Product();
				a[i].accept();
				
		}
		
		for(int i=0;i<5;i++)
		{
			
				System.out.println(a[i]);
		}
		Product pp = new Product();
		pp.find(a);
		

	}

}
