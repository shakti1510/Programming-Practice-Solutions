package DiamondPattern_Day11;

import java.util.Scanner;

class DPattern7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Value");
		int n=s.nextInt();
		s.close();
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				if(j<st)
					System.out.print(j+" * ");
				else
					System.out.print(j);
			}
			if(i<=n/2) {
				sp--;
				st++;
			}
			else {
				sp++;
				st--;
			}
			System.out.println();
		}
	}
}
