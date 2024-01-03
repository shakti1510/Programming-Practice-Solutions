package NoofDigit_Day4;

import java.util.Scanner;

class SumOddEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=s.nextInt();
		s.close();
		int os=0,es=0;
		do {
			int d=n%10;
			if(d%2==0) 
				es+=d;
			else
				os+=d;
			n/=10;
		}while(n!=0);
		System.out.println("Sum of Even digit is "+es+" and Odd digit is "+os);
		
	}

}
