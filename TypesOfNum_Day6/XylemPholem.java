package TypesOfNum_Day6;

import java.util.Scanner;

class XylemPholem {
	
	static boolean xylemPholem(int n) {
		int s=0,f=n%10;
		for(n=n/10;n>9;n=n/10) {
			s+=n%10;
		}
		n+=f;
		return s==n;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values:");
		int n=s.nextInt();
		s.close();
		if(xylemPholem(n)) {
			System.out.println("Xylem Number");
		} else {
			System.out.println("Phloem Number");
		}
	}

}
