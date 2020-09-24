package DailyCodingProblems;

import java.util.Random;

public class Stream {
	public static void main(String[] args) {
		int stream[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = stream.length;
		for (int i = 0; i < n; i++)
			System.out.println("Random number from first " + (i + 1) + " numbers is " + selectRandom(stream[i]));
	}

	static int res = 0;
	static int count = 0;

	public static int selectRandom(int x) {
		count++;

		if (count == 1) {
			res = x;
		}

		else {

			Random r = new Random();
			int i = r.nextInt(count);

			if (i == count - 1) {
				res = x;
			}

		}
		return res;
	}

}
