package arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

//	 	0 <= 3;
//		1 <= 4;
//		2 <= 5;
//		3 <= 6;
//		4 <= 7;
//		5 <= 8;
//		6 <= 9;

		int results[];
		results = rotateUsingIndexes(arr, 3, arr.length);
		print(results);

	}

	/**
	 * srcIndex: the destination index \n ex. (0 + 3) % 10 = 3; (1 + 3) % 10 = 4;
	 * 
	 * PS. Put each element in it's right place in new array
	 */
	public static int[] rotateUsingIndexes(int arr[], int d, int n) {
		int result[] = new int[n];

		for (int i = 0; i < n; i++) {
			int srcIndex = (i + d) % n;
			result[i] = arr[srcIndex];
		}

		return result;
	}

	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}
