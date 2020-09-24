package DailyCodingProblems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Seralize_Deseralize {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public String serialize(TreeNode root) {
		if (root == null)
			return "X";
		String left = serialize(root.left);
		String right = serialize(root.right);
		StringBuilder sb = new StringBuilder();
		sb.append(root.val);
		sb.append(",");
		sb.append(left);
		sb.append(",");
		sb.append(right);
		return sb.toString();
	}

	public TreeNode deserialize(String data) {
		Queue<String> queue = new LinkedList<>();
		queue.addAll(Arrays.asList(data.split(",")));
		return helper(queue);
	}

	public TreeNode helper(Queue<String> queue) {
		String value = queue.poll();
		if (value.equals("X"))
			return null;
		TreeNode newNode = new TreeNode(Integer.valueOf(value));
		newNode.left = helper(queue);
		newNode.right = helper(queue);
		return newNode;
	}
}
