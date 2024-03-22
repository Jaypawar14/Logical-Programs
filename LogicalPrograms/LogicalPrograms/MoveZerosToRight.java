package LogicalPrograms;

import java.util.Arrays;

import java.util.Arrays;

public class MoveZerosToRight {

	public static void main(String[] args) {

		int[] inputSequence = { 1, 0, 3, 4, 5, 0, 2, 3, 0, 2, 4, 0 };

		// int[] resultSequence = inputSequence;

		int nonZeroCount = 0;

		int Newarray[] = new int[inputSequence.length];
		// length of array as input

		for (int num : inputSequence) {

			if (num != 0) { // it will print all non zero

				Newarray[nonZeroCount] = num;

				nonZeroCount++; // q
			}
		}

		String Str = Arrays.toString(Newarray);

		System.out.println(Str);
		String Rev = "";

		for (int i = Str.length() - 1; i >= 0; i--) {

			Rev = Rev + Str.charAt(i);
		}
		System.out.println(Rev);

	}
}
