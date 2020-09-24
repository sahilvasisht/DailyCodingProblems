package DailyCodingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sum_in_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(3);
		list.add(7);
		// int k = s.nextInt();
		System.out.println(Sum(list, 90));
	}

	public static boolean Sum(ArrayList<Integer> list, int k) {
		int i = 0;
		int j = list.size() - 1;
		Collections.sort(list);
		while (i < j) {
			if (list.get(i) + list.get(j) > k) {
				j--;
			} else if (list.get(i) + list.get(j) < k) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}

}
