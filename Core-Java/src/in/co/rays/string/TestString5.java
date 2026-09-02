package in.co.rays.string;

public class TestString5 {
	
	public static void main(String[] args) {
		
		
		String name = "Rahul Shukla";
		
		
		System.out.println("name = " + name);
		
		System.out.println("lenth:" + name.length());
		
		System.out.println("7th char is:" + name.charAt(6));
		
		System.out.println("1st index of:" + name.indexOf('u'));
		
		System.out.println("last index of:" + name.lastIndexOf('k'));
		
		System.out.println(name.replace('u', 'm'));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.startsWith("Shukla"));
		
		System.out.println(name.endsWith("Rahul"));
		
		System.out.println(name.substring(5 , 8 ));
	}

}
