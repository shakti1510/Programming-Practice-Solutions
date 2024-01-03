package Pattern_Printing_Day9;

import java.util.Scanner;

class Pattern5Tr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		for (int i=1; i<=n; i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
