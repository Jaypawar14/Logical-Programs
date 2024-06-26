package LogicalPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepatitiveWord {

	public static void main(String[] args) {
		
	    String str = "apple,apple,apple,orange,orange,mango";
	    
        String[] words = str.split(",");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        	
            if (entry.getValue() > 0) {
                System.out.println("Repatitive Word: " + entry.getKey() + " & Count is: " + entry.getValue());
            }
        }
    }
}
