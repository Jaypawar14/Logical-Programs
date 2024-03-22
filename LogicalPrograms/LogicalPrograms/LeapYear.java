package LogicalPrograms;

public class LeapYear {

	public static void main(String[] args) {

		int year = 2022;  //4,400,100 
		  //false                         
		   //  2000%4 ==0  && 2000%100 != 0  || 2000%400==0 - true
		   //  2022%4 ==xyz && 2022%100 = true ||2022%400 == false
		
		if(((year%4==0) && (year%100 !=0)) || (year%400==0)) {
			System.out.println("Specified year a leap year");
		}
		else {
			System.out.println("Specified year is not a leap year");
		}
		
	}

}
