package DecisionMaking_Day3;

import java.util.Scanner;

class MonthNumberName {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Month Number");
		int m=s.nextInt();
		s.close();
		String[] st= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		if(m<0||m>12) {
			System.out.println("Invalid Month Number");
		} else {
			System.out.println("The Month is "+st[m-1]);
		}
	}

}
