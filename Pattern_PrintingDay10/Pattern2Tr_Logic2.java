package Pattern_PrintingDay10;

import java.util.Scanner;

class Pattern2Tr_Logic2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int c=1;
			for(int j=1;j<=2*i-1;j++) {
				if(j>i) {
					System.out.print(i-c+" ");
					c++;
				}else {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}