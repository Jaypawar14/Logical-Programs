package LogicalPrograms;

public class DuplicateElements {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,3,55,7,8,2,13,12,1};
		
		System.out.println("Duplicate element in given array");
		
		
		for(int i=0 ;i<arr.length;i++) {
			
			for(int j=i+1 ;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.print(arr[j] +" ");
				}
			}
		}
	}

}
