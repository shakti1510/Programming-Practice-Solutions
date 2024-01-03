package Pattern_Printing_Day9;

import java.util.Scanner;

class Pattern7Tr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		int x=0;
		for (int i=1; i <=n; i++) {
			for(int j=1;j<=i;j++) {
				if(x==0)
					System.out.print((++x)+" ");
				else
					System.out.print((--x)+" ");
			}
			System.out.println();
		}
	}

}
