package ArrayOp_Day14;

import java.util.*;
class ArrayOperation {

	//	23/11/2023 Class Notes

	int[] createArr() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=s.nextInt();
		int[] x=new int[n];
		System.out.println("Enter "+n+" elements:");
		for (int i = 0; i < x.length; i++) {
			x[i]=s.nextInt();
		}
		s.close();
		return x;
	}

	void displayArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i<a.length)
				System.out.print(",");
		}
		System.out.println();
	}

	int getBiggest(int[] ar) {
		int max=ar[0];
		for(int i:ar) {
			if(max<ar[i])
				max=ar[i];
		}
		return max;
	}

	int getSmallest(int[] ar) {
		int min=ar[0];
		for(int i:ar) {
			if(min>ar[i])
				min=ar[i];
		}
		return min;
	}
	//	23/11/2023 assignments

	int[] mergedArr(int[] a, int[] b) {
		int y=a.length,z=b.length;
		int[] x=new int[y+z];
		for(int i=0;i<y;i++) 
			x[i]=a[i];
		for(int i=0;i<z;i++)
			x[y+i]=b[i];
		return x;
	}

	int diffBigSmall(int[] a) {
		int max=a[0],min=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		return max-min;
	}

	int countPalindrome(int[] a) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(reverse(i)==i) {
				c++;
			}
		}
		return c;
	}

	int countEmirp(int[] a) {
		int c=0;
		for(int i:a) {
			if(isPrime(i)&&isPrime(reverse(i)))
				c++;
		}
		return c;
	}

	int reverse(int i) {
		int r=0;
		while(i!=0) {
			r=r*10+i%10;
			i/=10;
		}
		return r;
	}
	boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	int countHappyNo(int[] x) {
		int c=0;
		for (int i = 0; i < x.length; i++) {
			if(isHappy(x[i]))
				c++;
			//S.o.p(x[i]); for Printing Happy Number
		}
		return c;
	}

	boolean isHappy(int i) {
		while(i>9) {
			int sum=0;
			while(i!=0) {
				int d=i%10;
				sum+= d*d;
				i/=10;
			}
			i=sum;
		}
		return i==1||i==7;
	}

	//	24/11/2023 Class Notes

	int[] zigzag(int[] x,int[] y) {
		int[] z=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length) {
			z[k++]=x[i++];
			z[k++]=y[j++];
		}
		while(i<x.length)
			z[k++]=x[i++];
		while(j<y.length)
			z[k++]=y[j++];
		return z;
	}

	int[] mergeSort(int[] x,int[] y) {
		int[] z=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length) {
			if(x[i]<y[i])
				z[k++]=x[i++];
			else
				z[k++]=y[j++];
		}
		while(i<x.length)
			z[k++]=x[i++];
		while(j<y.length)
			z[k++]=y[j++];
		return z;
	}

	int search(int[] a,int n) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n)
				return i;
		}
		return -1;
	}
	
	//	24/11/2023 assignments

	int[] insertArr(int[] a,int b,int c) {
		int[] d=new int[a.length+1];
		if(c<0||c>a.length+1)
			System.out.println("Wrong Index");
		else {
			for(int i=0;i<c;i++)
				d[i]=a[i];
			d[c]=b;
			for(int i=c+1;i<d.length;i++)
				d[i]=a[i-1];
		}
		return d;
	}
	
	int[] deleteArr(int[] a,int c) {
		int[] d=new int[a.length+1];
		if(c<0||c>a.length-1)
			System.out.println("Wrong Index");
		else {
			for(int i=0;i<c;i++)
				d[i]=a[i];
			for(int i=c;i<d.length;i++)
				d[i]=a[i+1];
		}
		return d;
	}
	
	int countArr(int[] a,int b) {
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b)
				c++;
		}
		return c;
	}
	
	void replaceArr(int[] a,int b,int c) {
		a[c]=a[c]+b;
		b=a[c]-b;
		a[c]=a[c]-b;
	}
	
	int[] addArrinArr(int[] a,int[] b,int c) {
		int[] d=new int[a.length+b.length];
		for(int i=0;i<c;i++)
			d[i]=a[i];
		for(int i=0;i<b.length;i++)
			d[c+i]=b[i];
		for(int i=c;i<a.length;i++)
			d[b.length+i]=a[i];
		return d;
	}
	
	// 24/11/2023 Assignment
	
	int[] remDupli(int[] a) { // 10 20 10 48 20 74 85 
		boolean[] b=new boolean[a.length];//int[] br=new int[a.length];
		int c=0;//k=0;
		for (int i = 0; i < a.length; i++) {
			//boolean b=false;
			if(b[i]==false) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j]) {
						b[j]=true;
						//b=false; break;
					}
				}
				c++;
			}
			//if(b)
			//    br[k++]=a[i];
		}
		int[] x=new int[c];
		int c1=0;
		for(int i=0;i<b.length;i++) {// for(int i=0;i<k;i++)
			if(b[i]==false)          // x[i]=br[i];
				x[c1++]=a[i];
		}
		return x;
	}
	
	
	void pairSum(int[] a,int n) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==n)
					System.out.println(a[i]+"+"+a[j]+"="+n);
			}
		}
	}
	
	int[] evenFirstOddNext(int[] a) {
		int[] x=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				x[j++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				x[j++]=a[i];
			}
		}
		return x;
	}
	
//	int[] countEle(int[] a) {
//		int[] b=new int[a.length];
//		for (int i = 0; i < a.length; i++) {
//				for (int j = i+1; j < a.length; j++) {
//					if(a[i]==a[j]) {
//						b[j]++;
//					}
//				}
//		}
//		int[] x=new int[c];
//		int c1=0;
//		for(int i=0;i<b.length;i++) {
//			if(b[i]==false)
//				x[c1++]=a[i];
//		}
//		return x;
//	}
	
	int SecondLargest(int[] a) {
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
			}
		}
		return b[a.length - 2];
	}
	
	int NthBiggest(int[] a,int n) {// 11 34 58 20 78 85
		if(n>=a.length||n<0) {
			System.out.println("Invalid");
		} else {
			for(int i=0;i<a.length;i++) {
				int c=0;
				for(int j=0;j<a.length;j++) {
					if(a[j]>a[i]) {
						c++;
					}
				}
				if(c==n-1) {
					return a[i];
				}
					
			}
		}
		return -1;
	}

}
