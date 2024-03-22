package LogicalPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		int Originalnumber, sum, rem;
		// 1221 - Palindromenumber 1221
		// 1234 - 4321
		System.out.println("Enter a number");
		Scanner Sc = new Scanner(System.in);
		int num = Sc.nextInt();

		// 121
		Originalnumber = num;
                   //   121>0  True    121/10 - 12.33
		           //   12 >0  True    12/10  - 1.23 
		           //   1>0    True    1/10   - 0.41
		           //   0>0    false
		for (sum = 0; num > 0; num = num / 10) {

			rem = num % 10;    // 1  2 1
			sum = sum * 10 + rem;  //0 =0*10+1 = 1  1=1*10+2 =12  12=12*10+1  =121
			//12
		}
		    // 121==121
		if (sum == Originalnumber) {
			System.out.println(Originalnumber + " :is a palindrome number");
		} else {
			System.out.println(Originalnumber + " :is not a palindrome number");
		}

	}

}
