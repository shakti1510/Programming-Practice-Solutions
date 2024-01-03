package Array_Day12;

class ArrSumEO2 {

	static int[] countEO(int[] x) {
		int ec=0,oc=0;
		for (int i = 0; i < x.length; i++) {
			if(x[i]%2==0)
				ec+=x[i];
			else
				oc+=x[i];
		}
		int[] count= {ec,oc};
		return count; 
	}
	public static void main(String[] args) {
		int[] a= {34,56,43,28,32,54};
		int[] r=countEO(a);
		System.out.println("Sum of even numbers: "+r[0]);
		System.out.println("Sum of odd numbers: "+r[1]);
	}

}
