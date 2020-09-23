package DailyCodingProblems;

public class first_missing_positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 4, -1, 1 };
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {

		boolean[] ans = new boolean[nums.length + 2];
		ans[0] = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0 && nums[i] <= nums.length) {
				ans[nums[i]] = true;
			}
		}
		for (int i = 0; i < ans.length; i++) {
			if (!ans[i]) {
				return i;
			}
		}
		return -1;
	}

}
