package Num_Conversion_Day8;

import java.util.Scanner;

class DecimalToHexadecimal {
	static String deciToHex(int n) {
		String te=(n==0)?"0":"";
		String oc="";int c=0;
		String s= "0123456789ABCDEF";
		for(;n!=0;n/=16) {
			int d=n%16;
			te+=s.charAt(d);
			c++;
		}
		for(;c>0;c--)
			oc+=te.charAt(c-1);
		return oc;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		System.out.println(deciToHex(s.nextInt()));
		s.close();
	}
}
