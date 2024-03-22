package LogicalPrograms;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 878, 333, 74 };

		//System.out.println(arr.length);
		int maximum = arr[0]; // 33
		
        int len =arr.length;
        
		// 0<5
		// 1<5
		// 2<5
		// 3<5
		// 5<5 - false
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maximum) {
			
				maximum = arr[i];
			}

		}
		System.out.println("lagest number in given array is -->" + maximum);
		
        Arrays.sort(arr);

        System.out.println("Second largest number in given array -->"+arr[len-2]);

	}

}
