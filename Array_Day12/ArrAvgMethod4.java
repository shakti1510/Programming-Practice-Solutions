package Array_Day12;

class ArrAvgMethod4 {

	static double avgArrSum(int[] a) {
		double avg=0;
		for(int i:a) { 
			avg+=i;
		}
		return avg/a.length;
	}

	public static void main(String[] args) {
		int[] a= {34,56,43,28,32,54};
		System.out.println("The Average of the elements od Array : "+avgArrSum(a));
	}

}
