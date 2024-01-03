package Num_Conversion_Day8;

import java.util.Scanner;

class DecimalToOctal {

	static int deciToOct(int n) {
		int oc=0,d=1;
		for(;n!=0;n/=8) {
			oc=oc+(n%8)*d;
			d*=10;
		}
		return oc;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		System.out.println(deciToOct(s.nextInt()));
		s.close();
	}

}
