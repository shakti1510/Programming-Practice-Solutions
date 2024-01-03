package Scanner_Day1;

import java.util.Scanner;

class AreaSquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Side:");
		int side=s.nextInt();
		s.close();
		System.out.println("Area = "+(side*side));
		System.out.println("Perimeter = "+(4*side));
	}

}
