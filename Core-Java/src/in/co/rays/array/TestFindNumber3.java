package in.co.rays.array;

 public class TestFindNumber3 {
	
	public static void main(String[] args) {
		
		
		int[] num = { 12, 23, 43, 32, 15 };
		
		int number = 33;
		
		int count = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] == number) {
				count++;
				
			}
		}
		if (count ==0) {
			System.out.println("number not exist");
			
			
		} else {
			System.out.println("number exist");

		}
	}

}
