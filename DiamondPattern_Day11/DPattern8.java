package DiamondPattern_Day11;

import java.util.Scanner;

class DPattern8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=s.nextInt();
		s.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n||j==i||j==n-i+1)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
	}
}
