package TypesOfNum_Day6;

import java.util.Scanner;

class HappyNum {
	
	static boolean happyNumber(int n) {
		while(n>9) {
			int s=0;
			do {
				int d=n%10;
				s+=d*d;
				n/=10;
			}while(n!=0);
			n=s;
		}
		return n==1||n==7;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=s.nextInt();
		s.close();
		if(happyNumber(n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
