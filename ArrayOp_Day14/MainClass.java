package ArrayOp_Day14;

class MainClass {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int[] a= {34,53,43,56,31,53,7,53,87,4};
//		ao.pairSum(a, 87);
//		int[] b= {5,6,7};
//		int[] c=ao.evenFirstOddNext(a);
//		ao.addArrinArr(a, b, 3);
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}
		System.out.println(ao.SecondLargest(a));
	}
}
