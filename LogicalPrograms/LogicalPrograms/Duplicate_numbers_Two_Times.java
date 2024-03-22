package LogicalPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate_numbers_Two_Times {

	public static void main(String[] args) {

		int arr []= {1,2,2,3,4,5,6,6,7} ;  //

         //2 ,6
		HashMap<Integer, Integer> CountMap = new HashMap<Integer, Integer>();

		for (int num : arr) {

			CountMap.put(num,CountMap.getOrDefault(num, 0)+1);
					
		}	
		
		List<Integer> result = new ArrayList<Integer>();
		
		for (Map.Entry<Integer, Integer> entry : CountMap.entrySet()) {

			if (entry.getValue() ==  2) {

				result.add(entry.getKey());
					
				
			}
		}
		
		System.out.println(result);
	}
}
