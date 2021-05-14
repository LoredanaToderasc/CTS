package cts.toderasc.loredana.g1088.pattern.singleton;

public class RobotSoftware implements IRobotSoftware{
	
	int id;
	String categorie;
	String tipCerere;
	String cerere;
	
	private static RobotSoftware robot = null;

	private RobotSoftware() {
		
	}
	
	public RobotSoftware(int id, String categorie, String tipCerere, String cerere) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.tipCerere = tipCerere;
		this.cerere = cerere;
	}
	
	public static synchronized RobotSoftware getRobot() {
		if (robot == null) {
			robot = new RobotSoftware(1, "Cerere bursa", "urgenta", "Bursa");
		}
		return robot;
	}
	
	@Override
	public void trimiteCerere(String denumire) {
		System.out.println("Cererea: " + denumire + "a fost trimisa");
	}

	@Override
	public String getInformatii(String categorie) {
		System.out.println("Categoria cererii: " + robot.categorie);
		return null;
	}

	@Override
	public void prelucrareCerere(String tip) {
		if( tip.equals("urgenta")) {
			System.out.println("Cererea o sa fie prelucrata astazi");
		}
		else {
			System.out.println("Cererea o sa fie prelucrata in urmatoarea perioada");
		}
		
	}

	@Override
	public int getIdRobot() {
		return id;
	}
	
	

}
