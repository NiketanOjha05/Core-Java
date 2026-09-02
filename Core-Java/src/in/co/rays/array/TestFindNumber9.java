package in.co.rays.array;

public class TestFindNumber9 {
	
	public static void main(String[] args) {
		
		int[] num = { 44, 34, 2, 3, 45, 432, 343};
		
		int number = 46;
		
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
