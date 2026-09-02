package in.co.rays.array;

 public class TestFindNumber5 {
	
	public static void main(String[] args) {
		
		int[] num = {21, 32, 42, 45, 65, 78 };
		
		int number = 65;
		
		int count = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] == number) {
				count++;
				
			}
		}
		if (count == 0) {
			System.out.println("number  not exist");
			
			
		} else {
			System.out.println("number exist");

		}
	}

}
