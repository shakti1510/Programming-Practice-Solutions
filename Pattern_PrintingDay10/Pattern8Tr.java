package Pattern_PrintingDay10;

import java.util.Scanner;

class Pattern8Tr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			for(int j=n-1;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
