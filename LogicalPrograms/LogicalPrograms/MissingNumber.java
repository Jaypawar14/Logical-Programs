package LogicalPrograms;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {

		int arr []= {0,1,3,4,7,8};
		
		
		HashSet<Integer> Hs  =new HashSet<>();
		
		for(int num : arr) {
			Hs.add(num);
		}
		
		int len =arr.length+1;

		for(int i=0 ;i<len-1 ;i++) {
			
			if(!Hs.contains(i)) {
				
				System.out.println(i);

			}
		}

		
	}

}
