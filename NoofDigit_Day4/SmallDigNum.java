package NoofDigit_Day4;

import java.util.Scanner;

class SmallDigNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=s.nextInt();
		s.close();
		int min=n%10;
		do {
			int d=n%10;
			if(min>d) 
				min=d;
			n/=10;
		}while(n!=0);
		System.out.println("The Smallest digit is "+min);
	}
}
