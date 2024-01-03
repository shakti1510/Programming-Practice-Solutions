package ArrayCont_Day13;

class MergeArr {

	public static void main(String[] args) {
		int[] a= {23,45,85,96};
		int[] b= {78,93,52,78};
		int[] ma=mergedArr(a,b);
		for(int i=0;i<ma.length;i++) {
			System.out.println(ma[i]);
		}
	}

	static int[] mergedArr(int[] a, int[] b) {
		int y=a.length,z=b.length;
		int[] x=new int[y+z];
		for(int i=0;i<y;i++) 
			x[i]=a[i];
		for(int i=0;i<z;i++)
			x[y+i]=b[i];
		return x;
	}

}
