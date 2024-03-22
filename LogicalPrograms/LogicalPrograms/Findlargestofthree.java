package LogicalPrograms;

public class Findlargestofthree {

	public static void main(String[] args) {

		int a =522;
		int b =434;
		int c =3445;
		
		if(a>b && a>c) {
			System.out.println("a is greatest number");
		}
		else if (b>c && b>a) {
			System.out.println("b is greatest number");
		} 
		else {
			System.out.println("c is greatest number");
		}		
	}

}
