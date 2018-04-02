package programs;

import java.util.Arrays;

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,5,15,6,3,12,2};
		QuickSort(a);
		System.out.println("Quick Sorting ++++++++++:" + Arrays.toString(a));
		System.out.println("Array Length :"+a.length);
		System.out.println("Largest Element in an Array is :"+ a[a.length-1]);
		System.out.println("Second Largest Element in an Array is :"+a[a.length-2]);
	}

	private static void QuickSort(int[] a) {
		// TODO Auto-generated method stub
		quicksort(a,0,a.length-1);
	}

	private static void quicksort(int[] input, int low, int high) {
		// TODO Auto-generated method stub
		int i=low,j=high;
		int middleIndex = low + (high-low)/2; //middleIndex
		int pivot = input[middleIndex];
		while (i<=j) {
			while(input[i]<pivot) {
				i++;
			}
			while(input[j]>pivot) {
				j--;
			}
			if(i<=j) {
				swap(input,i,j);
				i++;
				j--;
			}
			if(low<j) {
				System.out.println("low < j"+Arrays.toString(input));
				quicksort(input, low, j);
			}
			if(high>i) {
				System.out.println("high>i"+Arrays.toString(input));
				quicksort(input, i, high);
			}
			System.out.println("Sorted Array :"+Arrays.toString(input));
		}
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
