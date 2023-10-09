package com.arrays;

public class Search {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 6, 8, 10, 22, 66 };
		int key = 3;
		int index = binarySearch(arr, key);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
