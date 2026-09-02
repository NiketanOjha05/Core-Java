package in.co.rays.exception;

public class CheckedPropagation3 {
	
	public static void main(String[] args) {
		
		
		try {
			First();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

	private static void First() throws Exception{
			Second();
		
		}
		
	private static void Second()throws Exception {
		Third();
		
	}

	private static void Third() throws Exception{
	    Fourth();
		
	}

	private static void Fourth()throws Exception {
		
		throw new Exception("Make a mistake");
		
	}

}
