package Pattern_Printing_Day9;

import java.util.Scanner;

class Pattern2Tr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		for (int i=1; i <=n; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}

}
