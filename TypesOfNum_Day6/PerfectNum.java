package TypesOfNum_Day6;

import java.util.Scanner;

class PerfectNum {

	static boolean perfNum(int n) {
		int s=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				s+=i;
		}
		return n==s;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=s.nextInt();
		s.close();
		if(perfNum(n)) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}
	}

}
