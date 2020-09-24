package DailyCodingProblems;

public class LogDataStructure {

	private int maxSize;
	private int[] log;
	private int curr;

	public LogDataStructure() {
		this.maxSize = 5;
		this.log = new int[5];
		this.curr = 0;
	}

	public void record(int id) {
		this.log[curr] = id;
		this.curr = (this.curr + 1) % this.maxSize;
	}

	public int getLast(int i) {
		return log[(this.curr - i + maxSize)% maxSize] ;
	}

	public void print() {
		for (int i = 0; i < maxSize; i++) {
			int idx = (this.curr + i) % maxSize;
			System.out.print(log[idx] + " ");
		}
		System.out.println();
	}

}
