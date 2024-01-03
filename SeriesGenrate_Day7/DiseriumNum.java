package SeriesGenrate_Day7;

class DiseriumNum {

	static void printDiserium() {
		for(int i=1;i<=999;i++) {
			int a=count(i),s=0;
			for(int t=i;t!=0;t/=10) {
				s+=prod(t%10,a);a--;
			}
			if(s==i) 
				System.out.println(i+" ");
		}
	}
	static int count(int i) {
		int c=0;
		for(;i!=0;i/=10)
			c++;
		return c;
	}
	static int prod(int t, int a) {
		int prod=1;
		for(;a!=0;a--) {
			prod*=t;
		}
		return prod;
	}
	public static void main(String[] args) {
		printDiserium();
	}

}
