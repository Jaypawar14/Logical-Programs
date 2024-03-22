package LogicalPrograms;

public class ArraySum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 11 }; // 15

		System.out.println(arr.length);

		int sum = 0;
		// 0<7 - true
		// 1<7 - true
		for (int i = 0; i < arr.length; i++) {
			// 1 = 0 + 1
			// 6 = 1+2
			sum = sum + arr[i];

			//System.out.println("Sum of all element -->" + sum);
		}

		System.out.println("Sum of all element -->"+sum);
	}

}
