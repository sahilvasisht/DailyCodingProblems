package DailyCodingProblems;

public class Adjacent_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 6, 2, 5 };
		System.out.println(AdjacentSum(arr));
	}

	public static int AdjacentSum(int[] arr) {
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < arr.length; i++) {
			excl_new = (incl > excl) ? incl : excl;
			incl = excl + arr[i];
			excl = excl_new;
		}
		return ((incl > excl) ? incl : excl);
	}

}
