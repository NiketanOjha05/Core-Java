package in.co.rays.array;

 public class TestFindNumber2 {
	
	public static void main(String[] args) {
		
		int[] arr = { 10, 23, 35, 67, 2, 32};
		
		int number = 67;
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == number) {
				count++;
				
				
				
			}
		}
		
		if (count == 0) {
			
			System.out.println("number not exist");
			
		} else {
			System.out.println("number exist");

		}
		
	}
	
	
	
	
	
	

}
