package LogicalPrograms;

public class MultiplyNumber {

	public static void main(String[] args) {

		int num1 =2;
		int num2 =20;
		int Mul =0;
		
                 // 1  ;1<=20
		         //       2<=20
		for(int i=1; i<=num2 ;i++) {
			//0  =0+10;
			Mul=Mul+num1;
			//10 =10+10;20
		}
		System.out.println("Mul of two num is --->"+Mul);
	}

}
