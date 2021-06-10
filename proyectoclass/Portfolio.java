package proyectoclass;

import java.util.ArrayList;

public class Portfolio {
	private ArrayList<Project> projects;

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	public double getPortfolioCost() {
		double sum = 0;
		for (int i = 0; i < projects.size(); i++)
			sum += projects.get(i).getInitialCost();
		return sum;
	}

	public void showPortfolio() {
		System.out.println("Portafolio");
		for (int i = 0; i < projects.size(); i++) {
			projects.get(i).elevatorPitch();

		}
	}

}
