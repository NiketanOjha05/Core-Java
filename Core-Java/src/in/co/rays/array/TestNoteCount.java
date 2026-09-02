package in.co.rays.array;

 public class TestNoteCount {
	
	public static void main(String[] args) {
		
		int amount = 22120;
		
		int[] notes = {200, 100, 50, 10 };
		
		int count = 0;
		
		for (int i = 0; i < notes.length; i++) {
			
			count = amount / notes[i];
			
			if (count > 0) {
				System.out.println(notes[i] + " = " + count);
				
				
			}
			
			amount = amount % notes[i];
		}
	}

}
