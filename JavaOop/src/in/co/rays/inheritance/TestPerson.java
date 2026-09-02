package in.co.rays.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Businessman b = new Businessman();

		b.setName("Niketan");
		b.setAddress("Indore");
		b.setDob(sdf.parse("2003-10-05"));
		b.setIncome(10000);

		System.out.println("Name : " + b.getName());
		System.out.println("Address :" + b.getAddress());
		System.out.println("Dob : " + b.getDob());
		System.out.println("income : " + b.getIncome());

		System.out.println("--------------");

		Doctor d = new Doctor();

		d.setName("Amit");
		d.setAddress("Mumbai");
		d.setDob(sdf.parse("2003-10-05"));
		d.setRegistrationNo("5262526");

		System.out.println("Name : " + d.getName());
		System.out.println("Address :" + d.getAddress());
		System.out.println("Dob : " + d.getDob());
		System.out.println("Reg.No. : " + d.getRegistrationNo());

		System.out.println("---------------------");

		Student s = new Student();

		s.setName("Rahul");
		s.setAddress("Bhopal");
		s.setDob(sdf.parse("2003-10-05"));
		s.setMarks(85);
		s.setRollNo("63543636");

		System.out.println("Name : " + s.getName());
		System.out.println("Address :" + s.getAddress());
		System.out.println("Dob : " + s.getDob());
		System.out.println("Marks : " + s.getMarks());
		System.out.println("RollNo : " + s.getRollNo());
	}

}
