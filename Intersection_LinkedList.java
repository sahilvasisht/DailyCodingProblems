package DailyCodingProblems;

public class Intersection_LinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode currA = headA;
		ListNode currB = headB;
		while (currA != currB) {
			currA = (currA == null ? headB : currA.next);
			currB = (currB == null ? headA : currB.next);
		}
		return currA;

	}
}
