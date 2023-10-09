package Harshal_Day5_Assignment_part2;

public class TwoDArray {
	public static void main(String[] args) {
		printArray();
	}

	private static void printArray() {
		System.out.print("Enter numbers of rows: ");
		int row = Utility.scannerint();
		System.out.print("Enter numbers of Coloumn: ");

		int coloumn = Utility.scannerint();
		int[][] arr = new int[row][coloumn];
		System.out.println("Enter a number you want to insert: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				arr[i][j] = Utility.scannerint();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
