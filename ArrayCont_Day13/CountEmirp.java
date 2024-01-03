package ArrayCont_Day13;

class CountEmirp {

	static int countEmirp(int[] a) {
		int c=0;
		for(int i:a) {
			if(isEmirp(i))
				c++;
		}
		return c;
	}
	static boolean isEmirp(int i) {
		return isPrime(i)&&isPrime(reverse(i));
	}
	static int reverse(int i) {
		int r=0;
		while(i!=0) {
			r=r*10+i%10;
			i/=10;
		}
		return r;
	}
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
	}

}
