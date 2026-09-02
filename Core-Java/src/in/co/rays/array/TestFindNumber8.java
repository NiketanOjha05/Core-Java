package in.co.rays.array;

public class TestFindNumber8 {
	
	public static void main(String[] args) {
		
		int[] num = { 64, 5, 43, 56, 32, 34, 45, 765, 65, };
		
		int number = 44;
		
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
