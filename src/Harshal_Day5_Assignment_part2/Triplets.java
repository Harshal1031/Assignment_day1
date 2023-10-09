package Harshal_Day5_Assignment_part2;

public class Triplets {
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		int n = Utility.scannerint();
		int[] arr = new int[n];
		System.out.println("Enter the Array Elment");
		int count = 6;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Utility.scannerint();
			count--;
			System.out.println(count + " are left to enter");
		}
		triplets(arr);
	}

	private static void triplets(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}

	}
}
