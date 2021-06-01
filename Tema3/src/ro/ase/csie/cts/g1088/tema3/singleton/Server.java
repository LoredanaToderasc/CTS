package ro.ase.csie.cts.g1088.tema3.singleton;

public class Server {
	
	String ip;
	String client;
	String serviciu;
	
	private static Server server = null;
	
	private Server() {
		
	}

	private Server(String ip, String client, String serviciu) {
		super();
		System.out.println("Apel constructor");
		this.ip = ip;
		this.client = client;
		this.serviciu = serviciu;
	}
	
	public static Server getServer(String ip, String client, String serviciu) {
		if (server == null) {
			server = new Server(ip, client, serviciu);
		}
		return server;
	}
	
}
