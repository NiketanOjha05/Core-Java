package in.co.rays.array;

 public class TestFindNumber4 {
	
	public static void main(String[] args) {
		
		
		int[] num = {24, 34, 54, 67, 3, 5, 36};
		
		int number = 3;
		
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
