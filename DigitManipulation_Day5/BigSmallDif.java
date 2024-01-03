package DigitManipulation_Day5;

import java.util.Scanner;

class BigSmallDif {

	static int difBigSmall(int n) {
		int b=-9,s=9;
		for(int t=n;t!=0;t/=10) {
			if(b>t%10)
				b+=t%10;
		}
		for(int t=n;t!=0;t/=10) {
			if(s>t%10)
				s+=t%10;
		}
		return b-s;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();s.close();
		System.out.println("The Difference of the Biggest number and smallest is "+difBigSmall(n));
	}

}
