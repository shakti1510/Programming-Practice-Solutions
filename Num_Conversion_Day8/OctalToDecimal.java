package Num_Conversion_Day8;

import java.util.Scanner;

class OctalToDecimal {
	static int octToDeci(int n) {
		int d=0,c=0;
		for(;n!=0;n/=10) {
			int dt=n%10;
			d+=dt*pow8(c);
			c++;
		}
		return d;
		
	}
	static int pow8(int c) {
		int prod=1;
		for(;c!=0;c--)
			prod*=8;
		return prod;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		System.out.println(octToDeci(s.nextInt()));
		s.close();
	}
}
