package TypesOfNum_Day6;

import java.util.Scanner;

class OddEvenEqula {
	
	static boolean evenOddEqual(int n) {
		int oc=0,ec=0;
		do {
			int d=n%10;
			if(d%2==0)
				ec++;
			else
				oc++;
			n/=10;
		}while(n!=0);
		return oc==ec;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		s.close();
		if(evenOddEqual(n)) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
	}

}
