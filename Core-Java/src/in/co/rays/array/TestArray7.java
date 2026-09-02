package in.co.rays.array;

 public class TestArray7 {
	
	public static void main(String[] args) {
		
		
		int[] marks = {87, 76, 92, 89, 94};
		
		
		System.out.println("lenght of is a = " + marks.length);
		
		System.out.println("-------");
		
		System.out.println(marks[0] + "," + marks[1] + "," + marks[2] + "," + marks[3] + "," + marks[4]);
		
		System.out.println("-------");
		
		System.out.println(marks[0] + marks[1] + marks[2] + marks[3] + marks[4]);
		
		System.out.println("-------");
		
		for (int i = 0; i < marks.length; i++) {
			
			System.out.println(i + " = " + marks[i]);
		}
	}

}
