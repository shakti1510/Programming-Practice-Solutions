package SeriesGenrate_Day7;

class CountPrime2 {
	
	static int countPrime() {
		int count=0;
		for(int i=1;i<=100;i++) {
			int c=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					c++;break;
				}
			}
			count+=(c==0)?1:0;
		}
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println("The number of prime number b/w 1 to 100 ="+countPrime());		
	}
}
