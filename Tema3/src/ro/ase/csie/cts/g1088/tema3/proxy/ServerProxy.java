package ro.ase.csie.cts.g1088.tema3.proxy;

public class ServerProxy implements InterfataServer{
	
	private InterfataServer server;
	
	public ServerProxy(InterfataServer server) {
		super();
		this.server = server;
	}

	@Override
	public String getAdresaIp() {
		return server.getAdresaIp();
	}

	@Override
	public int getPort() {
		return server.getPort();
	}

	@Override
	public int getNrMaximConexiuni() {
		return server.getNrMaximConexiuni();
	}

	@Override
	public boolean conectare() {
		return server.conectare();
		
	}

	@Override
	public boolean deconectare() {
		return server.deconectare();
	}

}
