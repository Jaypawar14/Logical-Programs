package LogicalPrograms;

public class Fibonaccisseries {

	public static void main(String[] args) {

		//FS = Next number is the sum of previous two numbers
		
		//0,1,1,2,3,5,8,13,21,34,55,......
		
		int a=-1,b=1,c;
		
		for(int i=1;i<=15;i++) {
			
			c=a+b;		// c=-1+1 =0    1	
			System.out.print(" "+c);  //0 1
			a=b;  // 1
			b=c;  // 0
		}		
	}

}
