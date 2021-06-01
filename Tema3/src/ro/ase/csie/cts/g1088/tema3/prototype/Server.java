package ro.ase.csie.cts.g1088.tema3.prototype;

import java.util.ArrayList;

public class Server {
	
	String ip;
	String client;
	String serviciu;
	
	private static Server server = null;
	
	private Server() {
		
	}

	public Server(String ip, String client, String serviciu) {
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Server copie =new Server();
		copie.ip=this.ip;
		copie.client=this.client;
		copie.serviciu=this.serviciu;
		System.out.println("S a realizat copierea");
		return copie;
	}
}
