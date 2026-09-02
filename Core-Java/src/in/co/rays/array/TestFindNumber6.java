package in.co.rays.array;

public class TestFindNumber6 {
	
	public static void main(String[] args) {
		
		int[] num = {34, 42, 4, 23, 43};
		
		int number = 4;
		
		int count = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] == number) {
				count ++;
				
			}
			
		}
		if (count == 0) {
			System.out.println("number not exist");
			
		} else {
			System.out.println("number exist");

		}
	}

}
