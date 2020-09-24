package DailyCodingProblems;

import java.util.Scanner;

public class Product_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] nums = new int[N];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();
		}
		int[] ans = productExceptSelf(nums);
		display(ans);
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] ans = new int[nums.length];
		int[] lprod = new int[nums.length];
		lprod[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			lprod[i] = lprod[i - 1] * nums[i - 1];
		}
		int[] rprod = new int[nums.length];
		rprod[nums.length - 1] = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			rprod[i] = rprod[i + 1] * nums[i + 1];
		}
		for (int i = 0; i < nums.length; i++) {
			ans[i] = lprod[i] * rprod[i];
		}
		return ans;
	}

	public static void display(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
