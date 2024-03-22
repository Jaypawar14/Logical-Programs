package LogicalPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LastcharofString_Ofeachword {

	public static void main(String[] args) {

//            String  str = "My Name Is Rahul";

          //y e s l
		Scanner Sc = new Scanner(System.in);

		System.out.println("Enter the string");
		
		String str = Sc.nextLine().trim();

		str = str + " ";

	 	String Str1 = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isWhitespace(ch)) {

				System.out.println(Str1.charAt(Str1.length()-1));

				Str1 = "";
				
			} else {
				Str1 = Str1 + ch;
			}
		}
	}
}
