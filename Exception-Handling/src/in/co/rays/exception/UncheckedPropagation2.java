package in.co.rays.exception;

public class UncheckedPropagation2 {
	
	public static void main(String[] args) {
		
		try {
			First();	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

	private static void First() {
		Second();
		
	}

	private static void Second() {
		Third();
		
	}

	private static void Third() {
		Fourth();
		
	}

	private static void Fourth() {
		
		throw new RuntimeException("Make a mistake");
		
	}

}
