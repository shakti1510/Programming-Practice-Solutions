package Array_Day12;

class ArrayMethod1 {
	
	static int sumOfArray(int[] x) {
		int total=0;
		for (int i = 0; i < x.length; i++)
			total+=x[i];
		return total;
	}

	public static void main(String[] args) {
		int[] a= {34,56,43,28,32,54};
		int s=sumOfArray(a);
		System.out.println("Sum of array elements: "+s);
	}

}
