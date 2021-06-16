package zoo;

public class Mammal {

	protected Integer energyLevel = 100;

	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}

	public void displayEnergy() {
		System.out.println("Nivel de energía: "+energyLevel);
	}

}
