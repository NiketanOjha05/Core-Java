package in.co.rays.string;

public class TestString2 {
	
	public static void main(String[] args) {
		
		
		String name = "Alok Sharma";
		
		
		
		System.out.println("name = " +name);
		
		System.out.println("lenth:" + name.length());
		
		System.out.println("5th char is:" + name.charAt(4));
		
		System.out.println("1st index of:" + name.indexOf('A'));
		
		System.out.println("last index of:" + name.lastIndexOf('a'));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.replace('l', 'c'));
		
		System.out.println(name.startsWith("sharma"));
		
		System.out.println(name.endsWith("Sharma"));
		
		System.out.println(name.substring(2,7));
	}

}
