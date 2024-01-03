package DecisionMaking_Day3;

import java.util.Scanner;

class MiddleNumber {
	public static int midNum(int a,int b,int c) {
		int max=((a>b)&&(a>c))?a:((b>c)?b:c);
		int min=((a<b)&&(a<c))?a:((b<c)?b:c);
		return (a+b+c)-(max+min);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 3 Input Values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		s.close();
		System.out.println("Middle Number: "+midNum(a, b, c));
	}

}
