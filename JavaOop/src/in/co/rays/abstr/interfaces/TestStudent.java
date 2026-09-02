package in.co.rays.abstr.interfaces;

public class TestStudent {

	public static void main(String[] args) {

		BioStudent b = new Student();

		b.practicalExperiments();
		b.microorganisms();
		b.specimen();

		System.out.println("============================");

		Gymer g = new Student();

		g.cardio();
		g.strenthTraining();
		g.weightLifting();
	}

}
