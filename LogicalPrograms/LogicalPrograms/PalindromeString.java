package LogicalPrograms;

public class PalindromeString {
//Assignment
	public static void main(String[] args) {

		String Str = "TsTs";
		// EXp - Result emoclew ot avaj dna noitamotua
		// Exp result - automation and java to welcome

		String Rev = "";
        
	 int len=Str.length();

		for (int i = Str.length() - 1; i >= 0; i--) {

			Rev = Rev + Str.charAt(i);
			
   
		}
		   System.out.println(Rev);
		   System.out.println(Str);
		   
		if(Str.equals(Rev)) {
			System.out.println("Palindrome string");
		}
		else {
			System.out.println("Notpalidrome string");

		}
		
		System.out.println(Rev);
		
		StringBuffer SB = new StringBuffer("Welcome");		
		SB.reverse();
		System.out.println(SB);
		
		
		StringBuilder SB1 =new StringBuilder("Java");	
		SB1.reverse();
		System.out.println(SB1);
	}

}
