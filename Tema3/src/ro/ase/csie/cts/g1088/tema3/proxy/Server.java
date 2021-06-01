package ro.ase.csie.cts.g1088.tema3.proxy;

public class Server implements InterfataServer{
	
	String ip;
	int port;
	int nrConexiuni = 0;
	static int nrMaximConexiuni = 2;
	
	public Server(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}

	@Override
	public String getAdresaIp() {
		return this.ip;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getNrMaximConexiuni() {
		return this.nrMaximConexiuni;
	}

	@Override
	public boolean conectare() {
		
		if(nrConexiuni < nrMaximConexiuni) {
			nrConexiuni++;
			return true;
		}
		return false;
	}

	@Override
	public boolean deconectare() {
		nrConexiuni--;
		return false;
	}
	
}
