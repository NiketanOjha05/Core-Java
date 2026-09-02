package in.co.rays.string;

public class TestString3 {
	
	public static void main(String[] args) {
		
		
		String name = "Abhishek Kumar";
		
		
		System.out.println("name = " + name);
		
		System.out.println("lenth: " + name.length());
		
		System.out.println("6th char is:" + name.charAt(5));
		
		System.out.println("1st index of:" + name.indexOf('A'));
		
		System.out.println("last index of:" + name.lastIndexOf('r'));
		
		System.out.println(name.startsWith("Abhi"));
		
		System.out.println(name.endsWith("mar"));
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.replace('h', 'l'));
		
		System.out.println(name.substring(6,9));
		
		
	}

}
