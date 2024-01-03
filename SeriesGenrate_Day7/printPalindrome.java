package SeriesGenrate_Day7;

class printPalindrome {

	static void dispPalindrome() {
		for(int i=100;i<=999;i++) {
			int r=0;
			for(int t=i;t!=0;t/=10) {
				r=r*10+t%10;
			}
			if(i==r) {
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		dispPalindrome();
	}

}
