package Pattern_Printing_Day9;

import java.util.Scanner;

class Pattern7Tr_Logic2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		int x=1;
		for (int i=1; i <=n; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x%2+" ");
				x++;
			}
			System.out.println();
		}
	}

}
