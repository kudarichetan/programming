package programs;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,15,6,3,12,2};
		insertionSort(a);
		System.out.println("Array Length :"+a.length);
		System.out.println("Largest Element in an Array is :"+ a[a.length-1]);
		System.out.println("Second Largest Element in an Array is :"+a[a.length-2]);
	}

	private static void insertionSort(int[] a) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<a.length;i++) {
			int j=i;
			while(j>0 && a[j]<a[j-1]) {
				int temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
				j--;
			}
			System.out.println("Sorted Array after "+ i +":"+Arrays.toString(a));
		}
		System.out.println("Sorted Array is :"+Arrays.toString(a));
	}
}
