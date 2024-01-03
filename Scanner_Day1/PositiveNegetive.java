package Scanner_Day1;

import java.util.Scanner;

public class PositiveNegetive {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the integer:");
		int a=s.nextInt();
		s.close();
		if(a>0) {
			System.out.print("Positive number");
		} else if(a<0) {
			System.out.print("Negetive number");
		} else
			System.out.print("Zero");
	}

}
