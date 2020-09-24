package DailyCodingProblems;

import java.util.HashMap;

public class longest_SS_lenk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcsss", 3));
	}

	public static int lengthOfLongestSubstring(String s, int k) {
		HashMap<Character, Integer> map = new HashMap<>();
		int begin = 0, end = 0;
		int counter = 0;
		int maxLen = 0;

		while (end < s.length()) {
			char cEnd = s.charAt(end);
			map.put(cEnd, map.getOrDefault(cEnd, 0) + 1);
			if (map.get(cEnd) == 1) {
				counter++; // new char
			}
			end++;

			while (counter > k) {
				char cBegin = s.charAt(begin);
				map.put(cBegin, map.get(cBegin) - 1);
				if (map.get(cBegin) == 0) {
					counter--;
				}
				begin++;
			}

			maxLen = Math.max(maxLen, end - begin);
		}

		return maxLen;
	}

}
