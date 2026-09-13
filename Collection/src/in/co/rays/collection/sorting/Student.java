package in.co.rays.collection.sorting;

public class Student implements Comparable<Student> {

	private String rollNo;
	private String name;
	private int phy;

	public Student(String rollNo, String name, int phy) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
	}

	@Override
	public int compareTo(Student i) {

		if (this.name.equals(i.name)) {
			return this.phy - i.phy;
		}

		else if (this.phy == i.phy) {
			return this.rollNo.compareTo(i.rollNo);
		}

		else {
			return this.rollNo.compareTo(i.rollNo);
		}
	}

	@Override
	public String toString() {
		return "rollNo: " + rollNo + " name: " + name + " phy: " + phy;
	}

}
