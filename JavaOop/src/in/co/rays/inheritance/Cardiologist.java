package in.co.rays.inheritance;

public class Cardiologist extends Doctor {

	private int heartDiseaseCases;
	private String ecgMachine;

	public int getHeartDiseaseCases() {
		return heartDiseaseCases;
	}

	public void setHeartDiseaseCases(int heartDiseaseCases) {
		this.heartDiseaseCases = heartDiseaseCases;
	}

	public String getEcgMachine() {
		return ecgMachine;
	}

	public void setEcgMachine(String ecgMachine) {
		this.ecgMachine = ecgMachine;
	}

}
