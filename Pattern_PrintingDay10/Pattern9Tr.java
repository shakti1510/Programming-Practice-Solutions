package Pattern_PrintingDay10;

import java.util.Scanner;

class Pattern9Tr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+j)+" ");
			}
			for(int j=i-1;j>0;j--) {
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}

}
