public class MergeCode {
	public static void main(String[] args) {
		int[] a1 = {1,3,5};
		int[] a2 = {-2,0,1};

		System.out.println("A1");
		print(a1);
		System.out.println("A2");
		print(a2);
		int[] a3 = mergeArrays(a1,a2);
		System.out.println("A3");
		print(a3);
	}

	public static int[] mergeArrays(int[] a1, int[] a2) {
		int[] a3 = new int[a1.length + a2.length];
		int a1Posn = 0;
		int a2Posn = 0;
		int a3Posn = 0;

		while(a1Posn < a1.length && a2Posn < a2.length) {
			// if a1Posn el is smaller or equal, add it to a3 and increment
			if(a1[a1Posn] <= a2[a2Posn]) {
				a3[a3Posn] = a1[a1Posn];
				a1Posn++;
			} 
			else { // else add a2El and increment a2

				a3[a3Posn] = a2[a2Posn];
				a2Posn++;
			}
			a3Posn++; // both cases increment a3

		}
		int finishPosn = a1Posn;
		int[] finishArray = a1;
		if(a2Posn < a2.length) {
			finishPosn = a2Posn;
			finishArray = a2;
		}
		while(finishPosn < finishArray.length) {
			a3[a3Posn] = finishArray[finishPosn];
			finishPosn++;
			a3Posn++;
		}
		

		return a3;
	}

	public static void print(int[] arr) {
		for(int el: arr) {
			System.out.printf("%5d", el);
		}
		System.out.println();
	}
}