package in.co.rays.array;

public class TestFindNumber7 {
	
	public static void main(String[] args) {
		
		int[] num = {64, 54, 3, 45, 54, 33};
		
		int number = 45;
		
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
