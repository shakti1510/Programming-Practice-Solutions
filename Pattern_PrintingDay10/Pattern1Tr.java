package Pattern_PrintingDay10;

import java.util.Scanner;

class Pattern1Tr {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k+=n-j;
			}
			System.out.println();
		}

	}
}
