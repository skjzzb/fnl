package assignment_38;

import java.util.Scanner;

public class Floor {
	float length,width;
	Scanner s= new Scanner(System.in);
	public Floor(float length, float width) {
		
		this.length = length;
		this.width = width;
	}
	public Floor() {
		// TODO Auto-generated constructor stub
		this.length = 00;
		this.width = 0;
	}
	public void totalTiles(Tile t)
	{
		float len=t.lenght;
		System.out.println("Enter length and Width for Floor");
		length=s.nextFloat();
		width=s.nextFloat();
		float rect;
		rect=length*width;
		float tile;
		tile= rect/len;
		System.out.println("Total number of tiles required for floor "+length+" X "+width);
		System.out.println(tile);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of Tile");
		Scanner s= new Scanner(System.in);
		float len=s.nextFloat();
		Tile t=new Tile(len);
		
		Floor f= new Floor();
		f.totalTiles(t);
		s.close();
		
		

	}

}
