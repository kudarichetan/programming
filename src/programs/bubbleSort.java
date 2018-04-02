package programs;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,15,6,3,12,2};
		bubbleSort(a);
		System.out.println("Array Length :"+a.length);
		System.out.println("Largest Element in an Array is :"+ a[a.length-1]);
		System.out.println("Second Largest Element in an Array is :"+a[a.length-2]);
	}

	private static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		for (int i=0; i<a.length;i++) {
			for(int j=a.length-1;j>i;j--) {
				if(a[j]<a[j-1]) {
					swap(a,j,j-1);
				}
			}
			System.out.println("Sorted Array after "+i+":"+Arrays.toString(a));
		}
		System.out.println("Sorted Array :+++++++++++"+Arrays.toString(a));
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
