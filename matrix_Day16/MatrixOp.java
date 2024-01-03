package matrix_Day16;

import java.util.*;

class MatrixOp {
	
	int[][] readMat(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int m=s.nextInt();
		System.out.println("Enter the rows:");
		int n=s.nextInt();
		System.out.println("Enter the "+(m*n)+" elements:");
		int[][] mat=new int[m][n];
		for(int i=0;i<mat.length;i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=s.nextInt();
			}
		}
		s.close();
		return mat;
	}
	
	void diplayMat(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	int[] sumEO(int[][] a) {
		int[] sum=new int[2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]%2==0)
					sum[0]+=a[i][j];
				else
					sum[1]+=a[i][j];
			}
		}
		return sum;
	}
	
	int[] posNegCount(int[][] a) {
		int[] c=new int[2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>=0)
					c[0]++;
				else
					c[1]++;
			}
		}
		return c;
	}
	
	int[][] transposeMat(int[][] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a[i].length; j++) {
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
		return a;
	}
	
	int primeCountMat(int[][] a) {
		int pc=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				pc+=(isPrime(a[i][j]))?1:0;
		}
		return pc;
	}

	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	int[][] add2Mat(int[][] a,int[][] b){
		if(a.length!=b.length || a[0].length!=b[0].length)
			return null;
		int[][] res=new int[a.length][a[0].length];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		return res;
	}
	
	int[] rowWiseBig(int[][] a) {
		int[] big=new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(big[i]<=a[i][j])
					big[i]=a[i][j];
			}
		}
		return big;
	}
	
	int[] colWiseBig(int[][] a) {
		int[] big=new int[a[0].length];
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				if(big[i]<=a[j][i])
					big[i]=a[j][i];
			}
		}
		return big;
	}
	
	void rowReverse(int[][] a){
		for(int i=0;i<a.length;i++) {
			int x=0,y=a[i].length-1;
			while(x<y) {
				int t=a[i][x];
				a[i][x]=a[i][y];
				a[i][y]=t;
				x++;y--;
			}
		}
	}

	void colReverse(int[][] a) {
		for(int i=0;i<a[0].length;i++) {
			int x=0,y=a.length-1;
			while(x<y) {
				int t=a[x][i];
				a[x][i]=a[y][i];
				a[y][i]=t;
				x++;y--;
			}
		}
	}
	
	int[] diagonalMatBig(int[][] a) {
		int[] d=new int[2];// d[0] primary d[1] secondary
		for (int i = 0; i < a.length; i++) {
			if(d[0]<a[i][i])// max< ele -> primary
				d[0]=a[i][i];
			if(d[1]<a[i][a.length-i-1])// max< ele -> secondary
				d[1]=a[i][a.length-i-1];
		}
		return d;
	}
	
	int[] diagonalMatSmall(int[][] a) {
		int[] d=new int[2];// d[0] primary d[1] secondary
		for (int i = 0; i < a.length; i++) {
			if(d[0]>a[i][i])// min>ele -> primary
				d[0]=a[i][i];
			if(d[1]>a[i][a.length-i-1])// min>ele -> secondary
				d[1]=a[i][a.length-i-1];
		}
		return d;
	}
	
	int[] diagonalMatSum(int[][] a) {
		int[] d=new int[2];// d[0] primary d[1] secondary
		for (int i = 0; i < a.length; i++) {
			d[0]+=a[i][i];// sum -> primary
			d[1]+=a[i][a.length-i-1];// sum -> secondary
		}
		return d;
	}
	
	
	
	int[][] mulMatrix(int[][] a,int[][] b){
		if(a[0].length!=b.length) {
			System.out.println("Multiplication not possible");
			return null;
		}
		int[][] res=new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for(int j=0;i<b[0].length;j++) {
				for (int k = 0; k < b.length; k++) {
					res[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return res;
	}
	
}
