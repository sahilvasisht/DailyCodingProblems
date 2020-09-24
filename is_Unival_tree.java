package DailyCodingProblems;

public class is_Unival_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public boolean isUnivalTree(TreeNode root) {

		boolean left_correct = (root.left == null || root.left.val == root.val && isUnivalTree(root.left));
		boolean right_correct = (root.right == null || root.right.val == root.val && isUnivalTree(root.right));

		return left_correct && right_correct;
	}

}
