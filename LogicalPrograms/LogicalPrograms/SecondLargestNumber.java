package LogicalPrograms;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int a[] = { 12, 3, 35, 1, 10, 3, 1 };

		int n = a.length;

		Arrays.sort(a);

		int second_largest = 0;

		for (int i = n - 2; i >= 0; i--) {

			if (a[i] != a[n - 1]) {

				second_largest = a[i];

				break;
			}
		}
			System.out.println("The second largest element in the array is: " + second_largest);		
	}

}
