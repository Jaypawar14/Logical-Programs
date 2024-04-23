package LogicalPrograms;

import java.util.Scanner;

public class AcceptUserinput {

	public static void main(String[] args) {
		
//		System.out.println("Enter a number");
//		
//		Scanner Sc = new Scanner(System.in);
//		
//		int num = Sc.nextInt();
//		
//		System.out.println("enter seconf number");
//		int  num1 =Sc.nextInt();
//		
//		System.out.println("Addition of two no is ="+(num+num1));
//		System.out.println("Addition of two no is ="+(num-num1));
	
		  String str = "Automation testing using Selenium";
	      
	      int len = str.length();
	      
	      String[] words = str.split(" ");
	      
	      String Reverse ="";
	      
	      for(String Word : words){
	          
	          String RevWord ="";
	          
	      for(int i=Word.length()-1 ;i>=0 ;i--){
	          
	          RevWord = RevWord+Word.charAt(i);
	      }
	      Reverse=Reverse+RevWord;
	    }
	        System.out.println(Reverse);

	    }
	

}
