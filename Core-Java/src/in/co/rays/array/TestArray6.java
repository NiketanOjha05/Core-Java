package in.co.rays.array;

 public class TestArray6 {
	
	public static void main(String[] args) {
		
		
		int[] number = {11, 22, 33, 44, 55};
		
		System.out.println("lenght of a is = " + number.length);
		
		System.out.println("---------");
		
		System.out.println(number[0] + "," + number[1] + "," + number[2] + "," + number[3] + "," + number[4] );
		
		System.out.println("---------");
		
		System.out.println(number[0] + number[1] - number[2] + number[3] + number[4]);
		
		System.out.println("---------");
		
		for (int i = 0; i < number.length; i++) {
			
			System.out.println(i + " = " + number[i]);
			
		}
	}

}
