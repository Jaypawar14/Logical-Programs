package LogicalPrograms;

import java.util.HashMap;

public class EcahCharacterOccurance {

	public static void main(String[] args) {

		// Using Java HashMap
		String str = "Ranjeet test";
		// HashMap char as a key and occurrence as a value
		
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		char strarray[] = str.toCharArray();
		
		for(char c : strarray) {
			
			if(!String.valueOf(c).isBlank()) {
				
			if (charCount.containsKey(c)) {
				
				charCount.put(c, charCount.get(c)+1);
				
			} else {
				
				charCount.put(c, 1);
		}
			}
		}
		System.out.println(charCount);
	}

}
