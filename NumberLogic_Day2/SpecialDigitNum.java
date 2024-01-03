package NumberLogic_Day2;

import java.util.Scanner;

class SpecialDigitNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer:");
		int n=s.nextInt();
		s.close();
		int[] d= {n/10,n%10};
		int sum=d[0]+d[1]+d[0]*d[1];
		if (sum==n) {
			System.out.println(n+" is a Special 2 digit number");
		} else {
			System.out.println(n+" is a Special 2 digit number");
		}
	}

}
