package cts.toderasc.loredana.g1088.pattern.singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		RobotSoftware robot = RobotSoftware.getRobot();
		RobotSoftware robot1 = RobotSoftware.getRobot();
		
		robot.trimiteCerere(robot.cerere);
		robot.getInformatii(robot.categorie);
		robot.prelucrareCerere(robot.tipCerere);
		System.out.println("Aceasta cerere va fi prelucrata de Robotul " + robot.id);
		
	}

}
