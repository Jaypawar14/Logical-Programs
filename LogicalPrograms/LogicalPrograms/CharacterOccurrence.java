package LogicalPrograms;

public class CharacterOccurrence {

	public static void main(String[] args) {
	    	
	        String input = "Ranjeete";

	        int count = 0;
	        char c='a';
	        
	        for (int i = 0; i < input.length(); i++) {       
	        	
	            if (input.charAt(i) == c) {           	
	                count++;
	            }
	            
	      	    }
	        System.out.println(count);
	            
	}
	}