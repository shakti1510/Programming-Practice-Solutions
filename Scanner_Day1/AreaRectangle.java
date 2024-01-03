package Scanner_Day1;

import java.util.Scanner;

class AreaRectangle {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the length of the Rectangle:");
		double len = s.nextDouble();
		System.out.print("Enter the breadth of the Rectangle:");
		double bdt = s.nextDouble();s.close();
		double per=2*(len+bdt);
		double area=len*bdt;
		System.out.println("Area of Rectangle is: "+area);
		System.out.println("Perimeter of Rectangle is: "+per);
	}

}
