package Array_Day12;

class ArrSumDigMethod7 {
	static int [] sumDigitArr(int[] x ) {
		for(int i=0;i<x.length;i++) {
			int s =0;
			while(x[i]!=0) {
				s += x[i]%10;
				x[i]=x[i]/10;
			}
			x[i]=s;
		}
		return x;
	}
	public static void main(String[] args) {
		int[] a = {10,20,35,37,13,24,65,79};
		int[] res = sumDigitArr(a);
		System.out.println("The sum of digit of the array is:");
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
	}
}

