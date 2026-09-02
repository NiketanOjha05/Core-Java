package in.co.rays.array;

public class TestCountNotes9 {
	
	public static void main(String[] args) {
		
		
		int amount = 53425;
		
		int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
		
		int count = 0;
		
		for (int i = 0; i < notes.length; i++) {
			count = amount / notes[i];
			
			if (count >0) {
				System.out.println(notes[i] + " = " + count);
				
			}
			amount = amount % notes[i];
			
			
		}
	}

}
