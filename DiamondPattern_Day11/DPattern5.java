package DiamondPattern_Day11;

import java.util.Scanner;

class DPattern5 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();s.close();
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			int c=(n+1)/2-sp,d=0;
			for(int j=1;j<=st;j++) {
				System.out.print(c+" ");
				if(d<st/2)
					c--;
				else
					c++;
				d++;
			}
			if(i<=n/2) {
				sp--;
				st+=2;
			} else {
				sp++;
				st-=2;
			}
			System.out.println();
		}
	}
	
}
