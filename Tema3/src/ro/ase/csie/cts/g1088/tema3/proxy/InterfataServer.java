package ro.ase.csie.cts.g1088.tema3.proxy;

public interface InterfataServer {
	 	public String getAdresaIp();
	    public int getPort();
	    public int getNrMaximConexiuni();

	    public boolean conectare();
	    public boolean deconectare();
}
