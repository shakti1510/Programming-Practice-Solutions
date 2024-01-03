package Pattern_Printing_Day9;

import java.util.Scanner;

class Pattern6Tr {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		for (int i=n; i>=1; i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
