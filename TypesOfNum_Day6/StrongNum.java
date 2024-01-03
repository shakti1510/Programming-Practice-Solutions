package TypesOfNum_Day6;

import java.util.Scanner;

class StrongNum {

	static boolean strongNum(int n) {
		int s=0;
		for(int t=n;t!=0;t/=10) {
			int d=t%10;
			int p=1;
			for(int i=1;i<=d;i++)
				p*=i;
			s+=p;
		}
		return n==s;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=s.nextInt();
		s.close();
		if(strongNum(n)) {
			System.out.println(n+" is Armstrong Number");
		} else {
			System.out.println(n+" is not Armstrong Number");
		}
	}

}
