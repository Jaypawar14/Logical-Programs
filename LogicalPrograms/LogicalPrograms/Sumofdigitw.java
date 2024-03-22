package LogicalPrograms;

import java.util.Scanner;

public class Sumofdigitw {
	
	public static void main(String arg[]) {

		int number, sum, Rem;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");

		number = sc.nextInt();

//executes until the condition number!=0 becomes false 

		for (sum = 0; number > 0; number = number / 10) { // 5

//finds the last digit and add it to the variable sum  
			Rem = number % 10;
			sum = sum + Rem;
		}

//prints the result  
		System.out.println("Sum of digits: " + sum);
	}
}
