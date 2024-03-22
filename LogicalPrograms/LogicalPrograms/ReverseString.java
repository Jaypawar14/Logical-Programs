package LogicalPrograms;

public class ReverseString {

	public static void main(String[] args) {

		
		// WAP to reverse a string without using the reverse method
		               //0  to n-1
		String  Str = "Hello good evening";
		
      StringBuffer SB =new StringBuffer("Hello good evening");	  
      
      System.out.println(SB.reverse());
		int len = Str.length();
		System.out.println(len);
		String Reverse  = "";
		System.out.println(Reverse.length());
		
		        // 17   ;17>=0 
		for(int i=len-1 ;i>=0 ;i--) {   // 17  16
			//   gn   =   g  + n
			Reverse = Reverse + Str.charAt(i);    // g 16
			
		}
		System.out.println(Reverse);
	

	}

}
