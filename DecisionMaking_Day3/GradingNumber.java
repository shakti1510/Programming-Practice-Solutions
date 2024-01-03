package DecisionMaking_Day3;

import java.util.Scanner;

class GradingNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your all subjects Marks:");
		int p=s.nextInt();
		int c=s.nextInt();
		int m=s.nextInt();
		int b=s.nextInt();
		s.close();
		if (p<35||c<35||m<35||b<35) {
			System.out.println("Fail");
		} else {
			int per=(p+c+m+b)/4;
			if(per>85&&per<=100) {
				System.out.println("Distinction ");
			} else if(per>65&&per<=85) {
				System.out.println("First Class");
			} else if(per>50&&per<=65) {
				System.out.println("Second Class");
			} else {
				System.out.println("Pass");
			}
		}
	}

}
