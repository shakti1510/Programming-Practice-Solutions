package SeriesGenrate_Day7;

import java.util.Scanner;

class countXylem {

	static int countxylem(int n,int m) {
		int count=0;
		for(int i=n;i<=m;i++) {
			if(xylemPholem(i))
				count++;
		}
		return count;
	}
	static boolean xylemPholem(int n) {
		int s=0,f=n%10;
		for(n=n/10;n>9;n=n/10) {
			s+=n%10;
		}
		n+=f;
		return s==n;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n and m");
		int n=s.nextInt();
		int m=s.nextInt();
		s.close();
		System.out.println("The number of Xylem numbers between "+n+" and "+m+" is "+countxylem(n,m));
		
	}

}
