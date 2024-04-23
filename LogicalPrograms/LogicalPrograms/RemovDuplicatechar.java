package LogicalPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemovDuplicatechar {

	public static void main(String[] args) {

		String str = "Rannjeet";
		
		Set<Character> se = new HashSet<>();
		
		StringBuffer Sb = new StringBuffer();
		
		for(int i=0 ;i<str.length() ;i++) {
			
			Character  c =str.charAt(i);

			if(!se.contains(c)) {
				se.add(c);
				Sb.append(c);
			}
		}
		System.out.println("After remvoing duplicate -->"+Sb);
		System.out.println(se);
		
	}

}
