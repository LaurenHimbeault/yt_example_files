public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {4,-2,0,4,-10,90,10,2,64};
		print(arr);
		selectionSort(arr);
		print(arr);
	}

	public static void selectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int minIndex = findMinIndex(array, i);
			if(minIndex != i) {
				// swap
				int temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
		}
	}


	public static int findMinIndex(int[] array, int startOfUnSortedPosn) {
		int minIndex = startOfUnSortedPosn;
		for(int i = startOfUnSortedPosn; i < array.length; i++) {
			if(array[i] < array[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static void print(int[] arr) {
		System.out.print("[");
		for(int el: arr) {
			System.out.print(el + " ");
		}
		System.out.println("]");
	}
}