package Pattern_PrintingDay10;

import java.util.Scanner;

class Pattern10Tr_Logic2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		for(int i=n;i>0;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int c=1;
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(c+" ");
				if(j<i) {
					c++;
				} else {
					c--;
				}
			}
			System.out.println();
		}
	}
}
