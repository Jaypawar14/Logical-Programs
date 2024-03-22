package LogicalPrograms;

import java.util.Arrays;

public class AnagramStirng {

	public static void main(String[] args) {

		String S1 ="race";
		String S2 ="care";
		
		String S3 ="java";
		String S4 ="avaj";
		
		char[] arr1 =S1.toCharArray();
		char[] arr2 =S2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.equals(arr1, arr2));

	}

}
