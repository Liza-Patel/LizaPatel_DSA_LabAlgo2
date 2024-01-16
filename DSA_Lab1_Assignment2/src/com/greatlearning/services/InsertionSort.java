package com.greatlearning.services;

import java.util.Arrays;

public class InsertionSort {

	public void sort(int[] arr) {

		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(arr));

		int temp, j;
		for (int k = 1; k < arr.length; k++) {
			temp = arr[k];
			j = k - 1;
			while (j >= 0 && temp >= arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(arr));

	}

}
