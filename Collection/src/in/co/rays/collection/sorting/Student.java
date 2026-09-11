package in.co.rays.collection.sorting;

public class Student {

	private int rollNo;
	private String name;
	private int phy;

	public Student(int i, String name, int phy) {
		this.rollNo = i;
		this.name = name;
		this.phy = phy;
	}

	@Override
	public String toString() {
		return "rollNo: " + rollNo + " name: " + name + " phy: " + phy;
	}

}
