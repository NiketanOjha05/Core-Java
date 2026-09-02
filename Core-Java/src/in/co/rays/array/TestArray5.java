package in.co.rays.array;

public class TestArray5 {
	
	public static void main(String[] args) {
		
		
	 	int[] n = {12, 22, 32, 42, 52};
		
		System.out.println("lenght of a is = " + n.length);
		
		System.out.println("-------");
		
		System.out.println(n[0] + "," + n[1] + "," + n[2] + "," + n[3] + "," + n[4]);
		
		System.out.println("---------");
		
		System.out.println(n[0] + n[1] + n[2] + n[3] + n[4]);
		
		System.out.println("--------");
		
		for (int i = 0; i < n.length; i++) {
			
			System.out.println(i+ " = " + n[i]);
			
		}
	}

}
