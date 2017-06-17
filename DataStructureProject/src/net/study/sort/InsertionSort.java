package net.study.sort;

import java.util.Arrays;

public class InsertionSort {
	
	static int[] doInsertionSort(int[] a){
		if(a != null && a.length >0){
			for (int i = 1; i < a.length; i++) {
				int value = a[i];
				int pos= i;
				while(pos > 0 && a[pos-1] > value){
					a[pos] =a[pos-1];
					pos--;
				}
				a[pos] = value;
			}
			
		}
		return a;
		
	}
	
	public static void main(String[] args) {
		int[] x={1,3,4,5,6,2,4,24};
		System.out.println(Arrays.toString(doInsertionSort(x)));
	}

}
