package LogicalPrograms;

public class RemoveSpicalChar {

	public static void main(String[] args) {
		
        String inputString = "Ranjeet123Kendre";
        
     //   String resultString = inputString.replaceAll("[^a-zA-Z]", "");

       String resultString =  inputString.replaceAll("[^a-zA-Z]", "");
        
        System.out.println("Original String: " + inputString);
        
        System.out.println("String after removing special characters: " + resultString);
    
        main5(args);
		
	}
	
	public static void main5(String[] args) {
		
		String input = "Hello!@#$%  ^&*World";
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			
			char currentChar = input.charAt(i);
			
			// Check if the character is a letter or digit
			
			if (Character.isLetterOrDigit(currentChar) || Character.isWhitespace(currentChar)) {
				result.append(currentChar);
			}
		}
		
		String Test = result.toString();
		System.out.println(Test);
		
	}
}
