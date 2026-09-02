package in.co.rays.array;

public class TestArray4 {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,4,8,5};
		
		System.out.println("lenght of a is = " +a.length);
		
		System.out.println("---------");
		
		System.out.println(a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4]);
		
		System.out.println("---------");
		
		System.out.println(a[0] + a[1] + a[2] + a[3] + a[4]);
		
		
		System.out.println("--------");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(i+ " = " + a[i]);
			
		}
		
		
	}

}
