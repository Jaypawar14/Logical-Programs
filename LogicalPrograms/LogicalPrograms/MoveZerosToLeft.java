package LogicalPrograms;

import java.util.Arrays;

import java.util.Arrays;

public class MoveZerosToLeft {

	public static void main(String[] args) {

		int[] inputSequence = { 1, 3, 4, 5, 0, 2, 3, 0, 2, 4, 0 };

		int[] resultSequence = inputSequence;

		int nonZeroCount = 0;

		int[] newSequence = new int[inputSequence.length];

		for (int num : inputSequence) {

			if (num != 0) {

				newSequence[nonZeroCount] = num;
				nonZeroCount++;
			}
		}
		
		String Str = Arrays.toString(newSequence);

		String Rev = "";

		for (int i = Str.length() - 2; i > 0; i--) {

			Rev = Rev + Str.charAt(i);
		}
		System.out.println(Rev);
	}
}
