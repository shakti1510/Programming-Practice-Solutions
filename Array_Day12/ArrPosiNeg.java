package Array_Day12;

class ArrPosiNeg {
	static int[] countPN(int[] x) {//static void countPN(int[] x)
		int pc=0,nc=0;
		for (int i = 0; i < x.length; i++) {
			if(x[i]>0)
				pc++;
			else
				nc++;
		}
		int[] count= {pc,nc};
		return count; 
		//S.O.P ("Positive number:"+ pc);
		//S.O.P ("Negative number:"+ nc);
	}
	public static void main(String[] args) {
		int[] a= {34,56,43,28,32,54};
		int[] r=countPN(a);
		System.out.println("Number of positive numbers: "+r[0]);
		System.out.println("Number of negetive numbers: "+r[1]);
	}
}
