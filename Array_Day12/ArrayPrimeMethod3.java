package Array_Day12;

class ArrayPrimeMethod3 {

	static int countPrimeArr(int[] a) {
		int count=0;
		for(int n:a) {
			int c=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					c++;
					break;
				}
			}
			if(c==0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int[] a= {34,56,43,28,31,53,7,5};
		System.out.println("Number of Prime numbers = "+countPrimeArr(a));
	}

}
