package Num_Conversion_Day8;

import java.util.Scanner;

class DecimalToBinary {
	
	static int deciToBin(int n) {
		int b=0,d=1;
		for(;n!=0;n/=2) {
			b=b+(n%2)*d;
			d*=10;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		System.out.println(deciToBin(s.nextInt()));
		s.close();
	}

}
