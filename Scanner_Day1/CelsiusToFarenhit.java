package Scanner_Day1;

import java.util.Scanner;

class CelsiusToFarenhit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Temperature in celsius :");
		double cel=s.nextDouble();
		s.close();
		double far=(9.0/5.0)*cel+32;
		System.out.println("the temperature in Farenhit: "+far);
	}

}
