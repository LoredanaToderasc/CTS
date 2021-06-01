package ro.ase.csie.cts.g1088.tema3.proxy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestServerProxy {

	InterfataServer server1 = new Server("100.1.0.1", 8001);
	InterfataServer server2 = new Server("100.1.0.2", 8010);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testProxy() {
		
		server1 = new ServerProxy(server1);
		
		if(server1.conectare()) {
			System.out.println("S-a accesat cu succes IP-ul: " + server1.getAdresaIp() + " cu portul: " + server1.getPort());
		}else {
			System.out.println("Nu s-a putut realiza conectarea pentru IP-ul: " + server1.getAdresaIp() + ", numarul de conexiuni e maxim: " + server1.getNrMaximConexiuni());
		}
		
		server1.deconectare();
		System.out.println(server1.getAdresaIp() + " s-a deconectat");
		
		if(server2.conectare()) {
			System.out.println("S-a accesat cu succes IP-ul: " + server2.getAdresaIp() + " cu portul: " + server2.getPort());
		}else {
			System.out.println("Nu s-a putut realiza conectarea pentru IP-ul: " + server2.getAdresaIp() + ", numarul de conexiuni e maxim: " + server2.getNrMaximConexiuni());
		}
	}
}
