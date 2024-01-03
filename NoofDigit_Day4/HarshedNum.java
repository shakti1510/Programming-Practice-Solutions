package NoofDigit_Day4;

import java.util.Scanner;

class HarshedNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value:");
		int n=sc.nextInt();
		int r=n;
		sc.close();
		int s=0;
		while(n!=0) {
			s+=n;
			n/=10;
		}
		if (r%s==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
