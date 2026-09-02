package in.co.rays.array;

 public class TestFindNumber {
	
	public static void main(String[] args) {
		
		
		int[] num = {15, 44, 63, 89, 4};
		
		int number = 89;
		
		int count = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] == number) {
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
