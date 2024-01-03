package DecisionMaking_Day3;

import java.util.Scanner;

class SanjuGeetaFunction {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Value:");
		int a=s.nextInt();
		s.close();
		if(a%3==0&&a%5==0) {
			System.out.println("Sanju weds Geeta");
		} else if(a%5==0) {
			System.out.println("Geeta");
		} else if(a%3==0) {
			System.out.println("Sanju");
		}  else {
			System.out.println("Break Up");
		}
	}

}
