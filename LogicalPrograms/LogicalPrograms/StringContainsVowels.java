package LogicalPrograms;

public class StringContainsVowels {

	public static void main(String[] args) {

		
		System.out.println(StringContainsVowels("Hellow"));

		System.out.println(StringContainsVowels("TVW"));

	}

	public static boolean StringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	//	return input.toLowerCase().matches("aeiou");

	}
}
