package LogicalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckConsecutiveNumbers {
    public static void main(String[] args) {
    	
    	Scanner Sc1 = new Scanner(System.in);
    	
    	System.out.println("Enter a first number");
    	int num1 =Sc1.nextInt();
    	
    	Scanner Sc2 = new Scanner(System.in);

     	System.out.println("Enter a sceond number");
    	int num2 =Sc2.nextInt();
   
    	Scanner Sc3 = new Scanner(System.in);

     	System.out.println("Enter a third number");
    	int num3 =Sc3.nextInt();
    	

        boolean areConsecutive = areConsecutiveNumbers(num1, num2, num3);

        if (areConsecutive) {
            System.out.println("The numbers are consecutive.");
        } else {
            System.out.println("The numbers are not consecutive.");
        }
    }

    public static boolean areConsecutiveNumbers(int num1, int num2, int num3) {
        // Convert the numbers to an array for easier comparison
        int[] numbers = {num1, num2, num3};

        // Sort the array
        Arrays.sort(numbers);

        // Check if the numbers are consecutive
        return (numbers[1] == numbers[0] + 1) && (numbers[2] == numbers[1] + 1);
    }
}