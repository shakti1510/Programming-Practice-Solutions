package ArrayCont_Day13;

class ListPalindrome {

	static boolean isPalindrome(int i) {
		int r=0;
		for(int t=i;t!=0;t/=10) {
			r=r*10+t%10;
		}
		return r==i;
	}
	
	static int countPalindrome(int[] a) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(isPalindrome(a[i])) {
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		int[] a= {323,445,585,796};
		System.out.println("No of Palindromes is:"+countPalindrome(a));
	}

}
