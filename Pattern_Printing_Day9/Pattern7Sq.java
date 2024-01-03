package Pattern_Printing_Day9;

import java.util.Scanner;

class Pattern7Sq {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		for (int i=1; i <=n; i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

}
