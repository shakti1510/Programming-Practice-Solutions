package NoofDigit_Day4;

import java.util.Scanner;

class SumSquares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value:");
		int n=sc.nextInt();sc.close();
		int s=0;
		while(n!=0) {
			int d=n%10;
			s+=d*d;
			n/=10;
		}
		System.out.println("The Sum of squares of the digits of the number is "+s);
	}

}
