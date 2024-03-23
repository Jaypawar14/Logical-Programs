package LogicalPrograms;

import java.util.Scanner;

public class ArmstrongNumberUserInput {

	public static void main(String[] args) {

		System.out.println("New Created");
		int P, Sum, Rem;
		// 122 - 1^3 =1 ,2^3 =8 ,2^3 =8 ===>17 - not Armstrong number
		// 153 - 1^1 =1, 5^3 =125 ,3^3 = 27 --> 153 Armstrong number

		System.out.println("Enter a number");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		P = num;   // P = 153
          
		for (Sum = 0; num > 0; num = num / 10) {

			Rem = num % 10;      //153%10 -- 3
			                     //15%10 - 5
			                     //1%10 - 1
			Sum = Sum + Rem * Rem * Rem; 
			//27  = 0+3*3*3
			//152 =27+5*5*5
			//153      =152+1*1*1 
			
		}

		if (Sum == P) {  //153 == 153
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not armstrong number");
		}

	}
	

		  
//		        int n,
//		        cubeSum = 0, num, r;
//		        Scanner sc = new Scanner(System.in);
//		        System.out.print("Enter number=");
//		        n = sc.nextInt();
//		        num = n;
//		        while (num > 0)
//		        {
//		            r = num % 10;
//		            cubeSum = cubeSum + (r * r * r);
//		            num = num / 10;
//		        }
//		        if (n == cubeSum)
//		        {
//		            System.out.println("Armstrong Number");
//		        }
//		        else
//		        {
//		            System.out.println("Not Armstrong Number");
//		        }
//		    }
}
