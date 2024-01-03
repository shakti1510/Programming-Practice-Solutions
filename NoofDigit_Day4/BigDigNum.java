package NoofDigit_Day4;

import java.util.Scanner;

class BigDigNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=s.nextInt();
		s.close();
		int max=0;
		do {
			int d=n%10;
			if(max<d) 
				max=d;
			n/=10;
		}while(n!=0);
		System.out.println("The largest digit is "+max);
	}

}
