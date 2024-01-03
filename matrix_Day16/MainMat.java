package matrix_Day16;

class MainMat {

	public static void main(String[] args) {
		MatrixOp m=new MatrixOp();
		System.out.println("Enter the Matrix 1:\n========================================");
		int[][] a=m.readMat();
		int[][] b=m.readMat();
		System.out.println("===User Entered Matrix 1:===");
		m.diplayMat(a);
		m.colReverse(a);
		System.out.println("Sum of the 2 matrices is: ");
		m.diplayMat(a);
		System.out.println("=======================");
		m.diplayMat(m.mulMatrix(a, b));
	}
}
