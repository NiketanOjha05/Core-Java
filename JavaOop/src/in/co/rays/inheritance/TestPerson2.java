package in.co.rays.inheritance;

public class TestPerson2 {

	public static void main(String[] args) {

		Lawyer l = new Lawyer();

		l.setName("Kumar");
		l.setAddress("Mumbai");
		l.setCaseNo(216);

		System.out.println("Name : " + l.getName());
		System.out.println("Address :" + l.getAddress());
		System.out.println("CaseNo : " + l.getCaseNo());

		System.out.println("---------------- ");

		Teacher t = new Teacher();

		t.setName("Raman");
		t.setAddress("indore");
		t.setSubjectName("Mathmatics");

		System.out.println("Name : " + t.getName());
		System.out.println("Address : " + t.getAddress());
		System.out.println("Subject : " + t.getSubjectName());
	}

}
