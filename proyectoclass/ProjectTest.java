package proyectoclass;

import java.util.ArrayList;

public class ProjectTest {

	public static void main(String[] args) {
		Project proyecto1 = new Project("casa", "creacion");
		Project proyecto2 = new Project("depto", "remodelacion");
		Project proyecto3 = new Project("casa", "implementacion");

		proyecto1.setInitialCost(5000);
		proyecto2.setInitialCost(3000);
		proyecto3.setInitialCost(7000);

		ArrayList<Project> projects = new ArrayList<Project>();
		projects.add(proyecto1);
		projects.add(proyecto2);
		projects.add(proyecto3);
//		proyecto1.elevatorPitch();

		Portfolio port = new Portfolio();
		port.setProjects(projects);
		System.out.println("costo total del portafolio: $" + port.getPortfolioCost());
		port.showPortfolio();
	}

}
