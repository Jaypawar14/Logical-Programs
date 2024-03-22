package LogicalPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FirstcharofString_Ofeachword {

	public static void main(String[] args) {

//            String  str = ";

          //y e s l		
		String str = "My Name Is Rahul";

		str = str + " ";

	 	String Str1 = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isWhitespace(ch)) {

				System.out.println(Str1.charAt(0));

				Str1 = "";
				
			} else {
				Str1 = Str1 + ch;
			}
		}
	}
}
