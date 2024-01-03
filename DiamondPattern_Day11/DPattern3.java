package DiamondPattern_Day11;

import java.util.Scanner;

class DPattern3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=s.nextInt();s.close();
		int sp=0,st=n;
		for(int i=1;i<=n; i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			if(i<=n/2) {
				sp++;
				st-=2;
			} else {
				sp--;
				st+=2;
			}
			System.out.println();
		}
	}

}
