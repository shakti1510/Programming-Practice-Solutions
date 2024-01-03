package Scanner_Day1;

import java.util.Scanner;

class LargestNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 3 numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		s.close();
		if(a>b) {
			System.out.println((a>c?a:c)+" is Largest");
		} else if(b>a) {
			System.out.println((b>c?b:c)+" is Largest");
		} else {
			System.out.println((c>a?c:a)+" is Largest");
		}
	}
}
