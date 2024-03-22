package LogicalPrograms;

public class FactorialNumber {

	public static void main(String[] args) {

		// Example --> 5*4*3*2*1 = 120
		int number = 5;

		int fac = 1;

		for (int i = 1; i <= number; i++) {

			fac = fac * i;
		}
		System.out.println("Factorail of " + number + "is -->" + fac);
	}

}
