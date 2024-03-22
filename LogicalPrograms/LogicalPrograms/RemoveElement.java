package LogicalPrograms;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {

		
		int arr[] = {1,2,3,4,5};
		
		int newarray[] = new int[arr.length-1];
		
		int len = arr.length;
		
		int index = 0;
		
		for(int i=0 ;i<=len-1 ;i++) {
			
			if(arr[i] != 2) {
				
				newarray[index]= arr[i];
				index++;
			}
		}
		System.out.println("Original array"+Arrays.toString(arr));
		System.out.println("New array"+Arrays.toString(newarray));
		
		for(int j=0 ;j<newarray.length; j++) {
			
			System.out.print(newarray[j]+" ");
		}

	}

}
