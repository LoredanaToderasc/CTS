package ro.ase.csie.cts.g1088.tema3.singleton;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestServerSingleton {
	
	Server server1 = null;
	Server server2 = null;

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
	public void testSingleton() {
		server1 = Server.getServer("100.0.0.1", "PC", "centralizeaza email-urile");
		server2 = Server.getServer("100.0.0.1", "PC", "centralizeaza email-urile");
	
		if(server1.ip == server2.ip) {
			System.out.println("Acelasi IP");
		}else {
			System.out.println("IP-uri diferite");
		}
	}

}
