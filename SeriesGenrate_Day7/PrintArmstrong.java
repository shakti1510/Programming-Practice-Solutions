package SeriesGenrate_Day7;

class PrintArmstrong {

	static void printArmstrong() {
		for(int i=100;i<=999;i++)
		{
			int s=0;
			for(int j=i;j!=0;j/=10) {
				int d=j%10;
				s+=d*d*d;
			}

			if(s==i) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		printArmstrong();
	}

}
