package in.co.rays.abstr.interfaces;


public class Student extends Person implements BioStudent, Gymer {

	@Override
	public void practicalExperiments() {
		System.out.println("Do Practical Experiments");

	}

	@Override
	public void microorganisms() {
		System.out.println("Do Microorganisms");
	}

	@Override
	public void specimen() {
		System.out.println("Do Specimen");

	}

	@Override
	public void strenthTraining() {
		System.out.println("Do Strenth Training");

	}

	@Override
	public void cardio() {
		System.out.println("Do Cardio");

	}

	@Override
	public void weightLifting() {
		System.out.println("Do Weight Lifting");

	}

}
