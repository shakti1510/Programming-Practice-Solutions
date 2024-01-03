package ArrayCont_Day13;

class sumBigSmall {
	
	static int diffBigSmall(int[] a) {
		int max=a[0],min=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		return max-min;
	}

	public static void main(String[] args) {
		int[] a= {23,45,85,96};
		System.out.println("Difference : "+diffBigSmall(a));
	}

}
