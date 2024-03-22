package LogicalPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoOccurance {
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 2, 3, 3, 4, 3, 5, 5 };

		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		List<Integer> result = new ArrayList<>();
		
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == 2) {
				result.add(entry.getKey());
			}
		}

		System.out.print("Output: ");
		
		for (int i = 0; i < result.size(); i++) {
			
			if (i > 0) {
				
				System.out.print(",");
			}		
			System.out.print(result.get(i));
		}
	}
}
