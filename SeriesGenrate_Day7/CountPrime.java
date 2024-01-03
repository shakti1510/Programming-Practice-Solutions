package SeriesGenrate_Day7;

class CountPrime {

	static int countPrime() {
		int count=0;
		for(int i=1;i<=100;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("The number of prime number b/w 1 to 100 ="+countPrime());
	}

}
